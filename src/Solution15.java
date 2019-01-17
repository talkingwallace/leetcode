import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Solution15 {

    //slow version
//    public List<List<Integer>> threeSum(int[] nums) {
//
//        Arrays.sort(nums,0,nums.length);
//
//        Map<Integer,Integer> dict = new HashMap<Integer, Integer>();
//        Set<List<Integer>> set = new HashSet<List<Integer>>();
//        //delete duplicate
//        for(int i=0;i<nums.length;i++){
//            if(dict.containsKey(nums[i])){
//                dict.put(nums[i],dict.get(nums[i])+1);
//            }
//            else{
//                dict.put(nums[i],1);
//            }
//        }
//
//        for(int i=0;i<nums.length;i++){
//            dict.put(nums[i],dict.get(nums[i])-1);
//            for(int j=i+1;j<nums.length;j++){
//                int target = -(nums[i]+nums[j]);
//                dict.put(nums[j],dict.get(nums[j])-1);
//                if(target>=nums[j]){
//                    if(dict.containsKey(target)&&dict.get(target)>0){
//                        ArrayList<Integer> tmp = new ArrayList<Integer>();
//                        tmp.add(nums[i]);
//                        tmp.add(nums[j]);
//                        tmp.add(target);
//                        set.add(tmp);
//                    }
//                }
//                dict.put(nums[j],dict.get(nums[j])+1);
//            }
//            dict.put(nums[i],dict.get(nums[i])+1);
//        }
//        return new ArrayList<List<Integer>>(set);
//    }

    //稍微快了一点点
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums,0,nums.length);

        Map<Integer,Integer> dict = new HashMap<Integer, Integer>();
        Set<List<Integer>> set = new HashSet<List<Integer>>();

        int count[] = new int[nums[nums.length-1]];
        for(int i=0;i<nums.length;i++)count[nums[i]]++;


        for(int i=0;i<nums.length;i++){
            count[nums[i]]--;
            for(int j=i+1;j<nums.length;j++){
                int target = -(nums[i]+nums[j]);
                count[nums[j]]--;
                if(target>=nums[j]){
                    if(dict.containsKey(target)&&dict.get(target)>0){
                        ArrayList<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(target);
                        set.add(tmp);
                    }
                }
                count[nums[j]]++;
            }
            count[nums[i]]++;
        }
        return new ArrayList<List<Integer>>(set);
    }
}
