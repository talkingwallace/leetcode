public class Solution378 {
    // TODO
    static public int kthSmallest(int[][] matrix, int k) {
        int distinctCount = 0;
        int preNum = matrix[0][0]+1; //保证不一样就行力
        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]!=preNum)distinctCount++;
                preNum = matrix[i][j];
                if(distinctCount == k)return matrix[i][j];
            }
        }
        return 0;
    }
}
