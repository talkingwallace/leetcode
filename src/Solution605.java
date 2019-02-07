public class Solution605 {

    // is available??
    static public boolean isAvai(int nums[],int idx){
        if(nums[idx]==1)return false;
        if(idx-1>=0&&nums[idx-1]==1){
            return false;
        }
        if(idx+1<=nums.length-1&&nums[idx+1]==1){
            return false;
        }
        nums[idx] = 1;
        return true;
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(flowerbed.length==0)return false;
        if(n==0)return true;
        for(int i=0;i<flowerbed.length;i++){
            if(isAvai(flowerbed,i)){
                n = n-1;
                if(n==0){
                    break;
                }
            }
        }
        if(n==0)return true;
        else return false;
    }
}
