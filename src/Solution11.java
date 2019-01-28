public class Solution11 {

    //https://leetcode.com/problems/container-with-most-water/discuss/6099/yet-another-way-to-see-what-happens-in-the-on-algorithm
    //这个是对于这个方法的解释，挺有意思的

    static public int maxArea(int[] height) {

        if(height.length==0)return 0;
        int max = 0;
        int start = 0,end = height.length-1;
        while(end>start){
            int area = Math.min(height[end],height[start])*(end-start);
            if(area>max)max = area;
            if(height[start]>height[end])end--;
            else start++;
        }
        return max;
    }
}
