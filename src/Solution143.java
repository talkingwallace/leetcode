import java.util.ArrayList;

public class Solution143 {

//    ArrayList<Integer> arr = new ArrayList<Integer>();
//
//    public void reorderList(ListNode head) {
//        if(head == null)return ;
//        ListNode l = head;
//        arr = new ArrayList<Integer>();
//        while(l!=null){
//            arr.add(l.val);
//            l = l.next;
//        }
//        System.out.println(arr);
//        int sub = 0,length = arr.size();
//        l = head;
//        for(int i=0;i<length;i++){
//            int index = i%2==0?sub:length-1-sub++;
//            System.out.println(index);
//            l.val = arr.get(index);
//            l = l.next;
//        }
//    }


    // smart solution

    public void reorderList(ListNode head) {
        if(head==null&&head.next==null)return;

        ListNode mid = FindMid(head);
        ListNode nxt = mid.next;
        mid.next = null;
        ListNode l2 = reverse(nxt);

        mergeLists(head,l2);
    }

    public ListNode reverse(ListNode l){
        ListNode pre = null,tmp = null;
        while(l!=null){
            tmp = l.next;
            l.next = pre;
            pre = l;
            l = tmp;
        }
        return pre;
    }

    public ListNode FindMid(ListNode head){
        ListNode slow = head, fast = head.next;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public void mergeLists(ListNode L1,ListNode L2){

        while(L2!=null) {
            ListNode tmp1 = L1.next;
            ListNode tmp2 = L2.next;
            L1.next = L2;
            L2.next = tmp1;
            L1 = tmp1;
            L2 = tmp2;
        }
    }
}
