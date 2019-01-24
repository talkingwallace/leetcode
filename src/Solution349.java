import java.util.*;

public class Solution349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>  m = new HashSet<Integer>();
        ArrayList<Integer> rs = new ArrayList<Integer>();
        for(int i:nums1){
            m.add(i);
        }
        for(int i:nums2){
            if(m.contains(i)){
                rs.add(i);
                m.remove(i);
            }
        }
        int cnmRs[] = new int[rs.size()];
        int count = 0;
        for(int i:rs){
            cnmRs[count++] = i;
        }
        return cnmRs;
    }
}
