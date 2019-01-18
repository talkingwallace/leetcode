public class Solution931 {

    public int [][]SM = null;

    //计算每一层的状态
    public void computeStatus(int layer,int A[][]){
        if(layer>=SM.length)return;
        for(int i=0;i<SM[0].length;i++){
           int min = SM[layer-1][i];
           int cost = A[layer][i];
           if(i-1>=0) min = Math.min(min,SM[layer-1][i-1]);
           if(i+1<SM[0].length) min = Math.min(min,SM[layer-1][i+1]);
           SM[layer][i] = min+cost;
        }
    }

    public int minFallingPathSum(int[][] A) {

        if(A.length == 0)return 0;
        SM = new int[A.length][A[0].length];
        for(int i=0;i<A[0].length;i++)SM[0][i] = A[0][i];

        for(int i=1;i<A.length;i++){
            computeStatus(i,A);
        }

//        for(int i=0;i<SM.length;i++){
//            System.out.println("");
//            for(int j=0;j<SM[i].length;i++)System.out.print(SM[i][j]+" ");
//        }

        int result = SM[A.length-1][0];
        //最后一层的最小值就是最小下落值
        for(int i=0;i<SM[0].length;i++){
            if(SM[SM.length-1][i]<result)result = SM[SM.length-1][i];
        }

        return result;
    }
}
