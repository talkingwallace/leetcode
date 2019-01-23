import java.util.ArrayList;
import java.util.List;

public class Solution23 {

    List<ListNode> rs = new ArrayList<ListNode>();

    public ListNode mergeKLists(ListNode[] lists) {

        ArrayList<ListNode> arr = new ArrayList<ListNode>();
        for(ListNode l:lists){
            if(l!=null)arr.add(l);
        }
        if(arr.size()==0)return null;

        //清除空链表并转换为数组
        int headsNum = arr.size();
        ListNode heads[] = new ListNode[arr.size()];
        arr.toArray(heads);

        int forwardIndex = 0;
        //比较每个数组头 最小者按顺序加入rs
        while(true){
            int ended = 0;
            ListNode min = new ListNode(Integer.MAX_VALUE);
            for(int i=0;i<heads.length;i++){
                if(heads[i]==null){
                    ended+=1;
                    continue;
                }
                if(heads[i].val<min.val){
                    forwardIndex = i;
                    min = heads[i];
                }
            }
            if(ended==headsNum)break;
            rs.add(min);
            heads[forwardIndex] = heads[forwardIndex].next;
        }

        for(int i=0;i<rs.size();i++){
            if(i+1==rs.size())rs.get(i).next = null;
            else rs.get(i).next = rs.get(i+1);
        }

        try{
            return rs.get(0);
        }catch (Exception e){
            return null;
        }
    }
}
