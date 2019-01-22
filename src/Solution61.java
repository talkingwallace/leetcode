import java.util.ArrayList;

public class Solution61 {

//    ArrayList<Integer> record = new ArrayList<Integer>();
//
//    public ListNode rotateRight(ListNode head, int k) {
//        if(k==0||head==null)return head;
//        record = new ArrayList<Integer>();
//        ListNode l = head;
//        while(l!=null){
//            record.add(l.val);
//            l = l.next;
//        }
//        int length = record.size();
//        int start = length-(k%length); // key point is here
//        l = head;
//        for(int i=0;i<length;i++){
//            if(start>=length)start=0;
//            l.val = record.get(start);
//            l = l.next;
//            start++;
//        }
//        return head;
//    }

    public ListNode rotateRight(ListNode head, int k) {
        if(k==0||head==null)return head;
        int length = 0;
        ListNode l = head,listEnd = null;
        while(l!=null){
            length ++;
            if(l.next == null)listEnd = l;
        }
        int start = length-(k%length); // key point is here

        ListNode pre = null;
        l = head;
        int count = 0;
        while(true){
            if(count == start){
                pre.next = null;
                listEnd.next = head;
                break;
            }
            pre = l;
            l = l.next;
            count++;
        }
        return l;
    }

}
