public class Solution141 {

    //一个有趣的解法，跟像汽车追尾一样，如果有环，一个跑的快，一个跑得慢，
    //慢的迟早被快的追上

    public boolean hasCycle(ListNode head) {

        ListNode h1 = head,h2 = head;
        while(h2!=null){
            if(h1!=null)h1=h1.next;
            if(h2.next!=null)h2 = h2.next.next;
            else break;
            if(h2 == h1)return true;
        }

        return false;
    }
}
