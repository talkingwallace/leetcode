import java.util.*;

public class Solution692 {

    static List<String> rs = new ArrayList<String>();

    public List<String> topKFrequent(String[] words, int k) {

        rs = new ArrayList<String>();
        if(words.length==0)return rs;
        Map<String,Integer> count = new TreeMap<String, Integer>();
        for(String n:words){
            if(count.containsKey(n)){
                count.put(n,count.get(n)-1);
            }
            else count.put(n,-1);
        }
        for(String s:count.keySet()){
            rs.add(s);
            k--;
            if(k==0)break;
        }
        return rs;
    }
}
