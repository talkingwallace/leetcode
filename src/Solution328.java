public class Solution328 {

    static ListNode oddHead,oddEnd;
    static ListNode evenHead,evenEnd;

    public boolean isOdd(int a){
        if((a & 1) == 1)return true;
        else return false;
    }

    public ListNode oddEvenList(ListNode head) {

        oddHead = null;
        oddEnd = null;
        evenEnd = null;
        evenHead = null;

        int count = 1;

        if(head==null)return null;
        ListNode cursor = head;
        while(cursor!=null){

            ListNode next = null;

            if(isOdd(count)){
                if(oddHead==null){
                    oddHead = cursor;
                    oddEnd = cursor;
                }
                else{
                    oddEnd.next = cursor;
                    oddEnd = oddEnd.next;
                }
            }
            else{
                if(evenHead==null){
                    evenHead = cursor;
                    evenEnd = cursor;
                }
                else{
                    evenEnd.next = cursor;
                    evenEnd = evenEnd.next;
                }
            }

            count++;
            next = cursor.next;
            cursor.next = null;
            cursor = next;
        }

        if(oddEnd!=null)oddEnd.next = evenHead;
        return oddHead;
    }
}
