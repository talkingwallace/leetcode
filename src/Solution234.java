import java.util.ArrayList;

public class Solution234 {

    ArrayList<Integer> rs = new ArrayList<Integer>();

    boolean isPldrm(ArrayList<Integer> rs){

        int start = 0, end = rs.size()-1;
        while(start<end){
            if(rs.get(start)!=rs.get(end)){
                rs.get(start).equals(end);
                System.out.println(rs.get(start)==rs.get(end));
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean isPalindrome(ListNode head) {
        System.out.println(-129==-129);
        if(head==null)return true;
        ListNode cur = head;
        while(cur!=null){
            rs.add(cur.val);
            cur = cur.next;
        }
        return isPldrm(rs);
    }
}
