import java.util.HashSet;

public class Solution832 {

    static public void printMat(int [][]A){
        for(int i=0;i<A.length;i++){
            for(int j = 0;j<A[i].length;j++){
                System.out.print(A[i][j]+ " ");
            }
            System.out.print('\n');
        }
    }

    static int invert(int a){
        if(a == 1)return 0;
        return 1;
    }

    static public int[][] flipAndInvertImage(int[][] A) {
        for(int i =0;i<A.length;i++){
            processARow(A[i]);
        }
        return A;
    }

    static public int[] processARow(int[] row){
        int s = 0,e = row.length-1;
        while(e>=s){
            if(e == s){
                row[e] = invert(row[e]);
            }
            else if(row[e]==row[s]){
                row[e] = invert(row[e]);
                row[s] = row[e];
            }
            s++;
            e--;
        }
        return row;
    }

    static public void test(){
        int A[][] = {{1,1,0},{1,0,1},{0,0,0}};
        int B[][] =  {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        printMat(B);
        System.out.print("_______________________________\n");
        flipAndInvertImage(B);
        printMat(B);
    }
}
