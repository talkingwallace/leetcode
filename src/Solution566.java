public class Solution566 {

    static public int[][] matrixReshape(int[][] nums, int r, int c) {

        int curL = nums.length;
        if(curL == 0)return nums;
        int curW = nums[0].length;
        if(curL*curW != r*c )return nums;

        int newMat[][] = new int[r][c];

        int  numsI = 0,numsJ = 0;

        for(int i=0;i<r;i++){

            for(int j=0;j<c;j++){
                newMat[i][j] = nums[numsI][numsJ++];
                if(numsJ==curW){
                    numsJ = 0;
                    numsI++;
                }
            }
        }
        return newMat;
    }
}

