import java.util.HashMap;

public class AnotherFor698 {

    //chao shi, it doesn't work
    // 需要设置一些条件来减少搜索的次数

    static HashMap<Integer,Integer> countHelper = new HashMap<Integer, Integer>();

    public boolean search(int count[],int val[],int k,int curSum,int target){
        if(k==0)return true;
        if(curSum>target)return false;
        if(curSum == target)return search(count,val,k-1,0,target);
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                count[i]--;
                int start = 0;
                if(search(count,val,k,curSum+val[i],target))return true;
                count[i]++;
            }
        }
        return false;
    }

    public boolean canPartitionKSubsets(int[] nums, int k){
        if(nums.length==0)return false;
        countHelper = new HashMap<Integer, Integer>();
        int sum = 0;
        for(int n:nums){
            sum += n;
            if(countHelper.containsKey(n)){
                countHelper.put(n,countHelper.get(n)+1);
            }
            else{
                countHelper.put(n,0);
            }
        }

        if(sum%k!=0)return false;
        int target = sum/k;

        int count[],val[];
        count = new int[countHelper.size()];
        val = new int[countHelper.size()];
        int idx = 0;
        for(int n:countHelper.keySet()){
            val[idx] = n;
            count[idx++] = countHelper.get(n);
        }
        return search(count,val,k,0,target);
    }
}
