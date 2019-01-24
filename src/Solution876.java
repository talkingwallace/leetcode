public class Solution876 {

    public ListNode middleNode(ListNode head) {
        if(head==null)return null;
        ListNode pre = head;
        ListNode nxt = pre.next;
        if(nxt==null)return pre;//只有一个节点的情况
        while(nxt!=null){

            pre = pre.next;
            nxt = nxt.next;
            if(nxt!=null)nxt = nxt.next;
            else{
                break;
            }
        }
        return pre;
    }
}
