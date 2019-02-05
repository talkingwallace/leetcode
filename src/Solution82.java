import java.util.List;

public class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
        ListNode cur = head,pre = null;
        int deleteVal = 0; // note down val to be deleted
        while(cur!=null){

            if(cur.next!=null&&cur.val == cur.next.val){
                deleteVal = cur.val;
                while(cur!=null&&cur.val==deleteVal){
                    cur = cur.next;
                }
                if(pre==null)head = cur;
                else if(cur == null){
                    pre.next = null;
                }
                else{
                    pre.next = cur;
                }
            }
            else{
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}
