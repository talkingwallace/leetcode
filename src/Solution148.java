import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution148 {

    List<Integer> arr = new ArrayList<Integer>();

    public ListNode sortList(ListNode head) {
        if(head == null)return null;
        ListNode l = head;
        while(l!=null){
            arr.add(l.val);
            l = l.next;
        }
        Collections.sort(arr);
        l = head;
        for(int i=0;i<arr.size();i++){
            l.val = arr.get(i);
            l = l.next;
        }
        return head;
        
    }
}
