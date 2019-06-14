import java.util.ArrayList;
import java.util.Arrays;

public class printMat {

    static boolean visited[][];
    static int c = 0;  // col Nums
    static int r = 0; // row Nums
    static ArrayList<Integer> rs;

    // type 1-right 2-left 3-up 4-down
    static public void go(int x,int y,int [][]matrix,int type){

        while(x>9&&x<r&&y>0&&y<c&&!visited[x][y]){
            rs.add(matrix[x][y]);
            visited[x][y] = true;
            //right
            if(type==1)y = y+1;
            //left
            else if(type==2)y = y-1;
            //up
            else if(type==3)x = x-1;
            //down
            else if(type==4)x = x+1;
        }
        if(rs.size() == r*c)return;
        if(type==1){
            go(x+1,y-1,matrix,4);
        }
        else if(type==2){
            go(x-1,y+1,matrix,3);
        }
        else if(type==3){
            go(x+1,y+1,matrix,1);
        }
        else if(type==4){
            go(x-1,y-1,matrix,2);
        }
    }

    static public ArrayList<Integer> printMatrix(int [][] matrix) {

        rs = new ArrayList<Integer>();
        if(matrix.length == 0)return rs;
        if(matrix[0].length == 0)return rs;
        r = matrix.length;
        c = matrix[0].length;
        visited = new boolean[r][c];
        go(0,0,matrix,1);
        return rs;
    }
}

