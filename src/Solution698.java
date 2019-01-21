public class Solution698 {

    public boolean search(int start,int nums[],boolean used[],int curSum,int k,int target){
        if(k==0)return true;
        if(curSum > target)return false;
        if(curSum == target)return search(0,nums,used,0,k-1,target);
        for(int i=start;i<nums.length;i++){
            if(!used[i]){
                used[i] = true;
                if(search(i+1,nums,used,curSum+nums[i],k,target))
                used[i] = false;
            }
        }
        return false;
    }

    public boolean canPartitionKSubsets(int[] nums, int k) {

        if(nums.length==0)return false;
        int sum =0;
        for(int n:nums)sum+=n;
        if(sum%k!=0)return false;

        int target = sum/k;
        return search(0,nums,new boolean[nums.length],0,k,target);
    }
}
