public class Solution766 {

    static int length,width;

    static public boolean topLeftToBottomRight(int matrix[][],int startIdxX,int startIdxy){

        int cmp = matrix[startIdxy][startIdxX];
        int i = startIdxy,j = startIdxX;
        while(i<length&&j<width){

            if(matrix[i][j]!=cmp)return false;
            i++;
            j++;
        }
        return true;
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        length = matrix.length;
        if(length==0)return false;
        if(length==1)return true;
        width = matrix[0].length;
        for(int i = 0;i<width;i++){
            if(!topLeftToBottomRight(matrix,i,0))return false;
        }
        for(int j=0;j<length;j++){
            if(!topLeftToBottomRight(matrix,0,j))return false;
        }
        return true;
    }
}
