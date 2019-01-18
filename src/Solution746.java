public class Solution746 {

    static int []c = null;

    static public int minCostClimbingStairs(int[] cost) {
        if(cost.length==0||cost.length==1)return 0;
        c = new int[cost.length];
        c[0] = cost[0];
        c[1] = cost[1];

        for(int i=2;i<cost.length;i++){
            c[i] = Math.min(c[i-1],c[i-2])+cost[i];
        }

        for(int i:c){
            System.out.print(i+" ");
        }
        System.out.println("");

        return Math.min(c[cost.length-1],c[cost.length-2]);
    }
}
