public class Solution867 {

    static public int[][] transpose(int[][] A) {

        if(A.length==0)return A;
        int length = A.length;
        int width = A[0].length;

        int rs[][] = new int[width][length];
        for(int i=0;i<width;i++){
            for(int j=0;j<length;j++){
                rs[i][j] = A[j][i];
            }
        }

        return rs;
    }
}
