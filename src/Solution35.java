public class Solution35 {

    static public int binSearch(int start,int end,int nums[],int target){
        if(start>end)return start;
        int mid = (start+end)/2;
        if(start==end&&nums[start]!=target){
            if(target>nums[start])return start+1;
            else return start;
        }
        if(nums[mid]==target)return mid;
        if(nums[mid]<target)return binSearch(mid+1,end,nums,target);
        else return binSearch(start,mid-1,nums,target);
    }

    static public int searchInsert(int[] nums, int target) {
        nums = new int[]{1,3};
        target = -123;
        if(nums.length==0)return 0;
        return binSearch(0,nums.length-1,nums,target);
    }

    static void test(){
        System.out.println(searchInsert(new int[]{1},5));
    }
}
