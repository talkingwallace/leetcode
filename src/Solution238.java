public class Solution238 {

    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int result[] = new int[nums.length];
        if(nums.length == 0)return result;

        int zeroNum = 0; //注意有0的情况

        for(int i:nums){
            if(i==0){
                zeroNum++;
                continue;
            }
            total *= i;
        }
        if(zeroNum==0){
            for(int i=0;i<nums.length;i++)result[i] = total/nums[i];
        }
        else if(zeroNum==1){
            for(int i=0;i<nums.length;i++)result[i] = nums[i]==0?total:0;
        }
        else return result;

        return result;
    }
}
