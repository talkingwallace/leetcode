public class Solution167 {

    static boolean isUsed[];

    public int BinSearch(int target,int nums[],int start,int end){

        if(start>end)return -1;
        int mid = (start+end)/2;
        if(nums[mid]==target){
            if(isUsed[mid]){
                if(mid+1<=isUsed.length-1&&nums[mid+1]==nums[mid])return mid+1;
                else if (mid-1>=0&&nums[mid-1]==nums[mid])return mid-1;
                else return -1;
            }
            else return mid;
        }
        if(target>nums[mid])return BinSearch(target,nums,mid+1,end);
        else if(target<nums[mid])return BinSearch(target,nums,start,mid-1);
        return -1;
    }

    public int[] twoSum(int[] numbers, int target) {

        if(numbers.length==0)return null;
        int result[] = new int[2];

        isUsed = new boolean[numbers.length];

        for(int i=0;i<numbers.length;i++){
            int search = target - numbers[i];
            isUsed[i] = true;
            int sR = BinSearch(search,numbers,0,numbers.length-1);
            if(sR!=-1){
                result[0] = i+1;
                result[1] = sR+1;
                break;
            }
            isUsed[i] = false;
        }
        return result;
    }
}
