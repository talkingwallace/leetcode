public class reverseLinkedList {

    static ListNode last = null;

    static public void visit(ListNode node,ListNode pre){
        if (node == null)return;
        last = node;
        ListNode tmp = node.next;
        node.next = pre;
        visit(tmp,node);
    }

    static public ListNode ReverseList(ListNode head) {
        if(head == null)return null;
        last = null;
        visit(head,null);
        return last;
    }

}
