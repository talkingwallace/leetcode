public class Solution59 {

    // 0 left 1 down 2 right 3 up
    static void go(int x,int y,int direction,int count,int rs[][]){
        int n = rs.length;
        if(direction==2){ // go right
            while(y<n&&rs[x][y]==0){
                rs[x][y] = count++;
                y++;
            }
            if(y>=n||rs[x][y]!=0)y--;
        }
        else if(direction==0){ //go left

            while(y>=0&&rs[x][y]==0){
                rs[x][y] = count++;
                y--;
            }
            if(y<0||rs[x][y]!=0)y++;
        }
        else if(direction==1){ //down
            while(x<n&&rs[x][y]==0){
                rs[x][y] = count++;
                x++;
            }
            if(x>=n||rs[x][y]!=0)x--;
        }
        else if(direction==3){
            while(x>=0&&rs[x][y]==0){
                rs[x][y] = count++;
                x--;
            }
            if(x<0||rs[x][y]!=0)x++;
        }

        if(y+1<n&&rs[x][y+1]==0)go(x,y+1,2,count,rs);
        if(y-1>=0&&rs[x][y-1]==0)go(x,y-1,0,count,rs);
        if(x+1<n&&rs[x+1][y]==0)go(x+1,y,1,count,rs);
        if(x-1>=0&&rs[x-1][y]==0)go(x-1,y,3,count,rs);
        return ;
    }

    // spiral matrix
    public int[][] generateMatrix(int n) {
        if(n==0)return null;
        int rs[][] = new int[n][n];
        go(0,0,2,1,rs);
        return rs;
    }
}
