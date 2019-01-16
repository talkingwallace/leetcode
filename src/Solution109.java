class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution109 {

    static int listLen = 0;

    public static TreeNode construct(int start,int end,int arr[]){
        if(start>end)return null;
        int center = (start+end)/2;
        TreeNode root = new TreeNode(arr[center]);
        root.left = construct(start,center-1,arr);
        root.right = construct(center+1,end,arr);
        return root;
    }

    public TreeNode sortedListToBST(ListNode head) {

        //initialize turn list into arr
        listLen = 0;
        ListNode s = head;
        while(s!=null){
            s = s.next;
            listLen++;
        }
        int arr[] = new int[listLen];
        s = head;
        int k =0;
        while(s!=null){
            arr[k++] = s.val;
            s = s.next;
        }

        //construct tree
        TreeNode result = construct(0,arr.length-1,arr);

        return result;
    }
}
