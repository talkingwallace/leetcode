public class Solution42 {


    //Solutions:
    //https://leetcode.com/problems/trapping-rain-water/solution/#approach-2-dynamic-programming

    //O(N) TIME O(N) SPACE
    public int trap(int[] height) {
        if(height.length==0)return 0;

        int fromLeft[] = new int[height.length];
        int fromRight[] = new int[height.length];

        //从左看最高
        int leftMax = 0;
        for(int i=0;i<height.length;i++){
            if(height[i]>leftMax){
                leftMax = height[i];
            }
            fromLeft[i] = leftMax;
        }

        //从右看最高
        int rightMax = 0;
        for(int i = height.length-1;i>=0;i--){
            if(height[i]>rightMax){
                rightMax = height[i];
            }
            fromRight[i] = rightMax;
        }
//
//        for(int i:fromLeft){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        for(int i:fromRight){
//            System.out.print(i+" ");
//        }

        //计算积水
        int sum = 0;
        for(int i=0;i<height.length;i++){
            sum+= Math.min(fromLeft[i],fromRight[i]) - height[i];
        }

        return sum;
    }
}
