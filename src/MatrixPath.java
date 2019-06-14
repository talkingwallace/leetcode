import java.util.HashSet;

public class MatrixPath {
    static int r;
    static int c;
    static char s[];

    public boolean v(char[][] matrix,int x,int y,int idx,HashSet<String> recorded){
        System.out.print(x+" "+y+" ");
        if(idx==s.length)return true;
        if(x>r-1||x<0)return false;
        if(y>c-1||y<0)return false;
        System.out.print(matrix[x][y]);
        String xy = ""+x+"_"+y;
        if(recorded.contains(xy))return false;
        if(s[idx] == matrix[x][y]){
            System.out.println(s[idx]);
            idx ++;
            recorded.add(xy);
            return v(matrix,x+1,y,idx,recorded)||v(matrix,x-1,y,idx,recorded)||v(matrix,x,y+1,idx,recorded)||v(matrix,x,y-1,idx,recorded);
        }
        else return false;
    }

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        if(rows == 0 || cols == 0)return false;
        s = str;
        r = rows;
        c = cols;
        char [][]fuckYou = new char[rows][cols];
        int count = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[count]+" ");
                fuckYou[i][j] = matrix[count++];
            }
            System.out.println();
        }



        for(int x=0;x<rows;x++){
            for(int y=0;y<cols;y++){
                System.out.println();
                if(v(fuckYou,x,y,0,new HashSet<String>())){
                    return true;
                }
            }
        }
        return false;
    }

}
