public class Solution24 {

    public ListNode swapTwo(ListNode head){
        if(head==null)return null;
        if(head.next==null)return head;
        ListNode next = head.next;
        ListNode tmp = next.next;
        next.next = head;
        head.next = tmp;
        head.next = swapTwo(head.next);
        return next;
    }

    public ListNode swapPairs(ListNode head) {
        if(head==null)return null;
        ListNode newHead = head.next==null?head.next:head;
        return swapTwo(head);
    }
}
