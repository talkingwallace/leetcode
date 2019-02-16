import java.util.Arrays;

public class Solution611 {

    static public boolean canMakeTriangle(int a,int b,int c){
        return (a-b)<c&&(b-c)<a&&(c-a)<b;
    }

    static public int triangleNumber(int[] nums) {

        Arrays.sort(nums);
        int triNum = 0;
        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){

                for(int k=j+1;k<nums.length;k++){
                    if(canMakeTriangle(nums[i],nums[j],nums[k]))triNum++; //这部分可以换成二分搜索
                    else{
                        break;
                    }
                }
            }
        }

        return triNum;
    }

    // binary search & linear scan

//    int binarySearch(int nums[], int l, int r, int x) {
//        while (r >= l && r < nums.length) {
//            int mid = (l + r) / 2;
//            if (nums[mid] >= x)
//                r = mid - 1;
//            else
//                l = mid + 1;
//        }
//        return l;
//    }
//    public int triangleNumber(int[] nums) {
//        int count = 0;
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 2; i++) {
//            int k = i + 2;
//            for (int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++) {
//                k = binarySearch(nums, k, nums.length - 1, nums[i] + nums[j]);
//                count += k - j - 1;
//            }
//        }
//        return count;
//    }
}
