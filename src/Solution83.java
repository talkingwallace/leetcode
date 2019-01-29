public class Solution83 {

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null){
            if(pre!=null){
                if(pre.val==cur.val){
                    pre.next = cur.next;
                    cur = cur.next;
                    continue;
                }
            }
            pre = cur;
            cur = cur.next;
        }
        return head;
    }
}
