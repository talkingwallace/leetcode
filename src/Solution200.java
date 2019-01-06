public class Solution200 {

    static int length = 0;
    static int width = 0;
    static int islandNum = 0;

    static public int numIslands(char[][] grid) {

        islandNum = 0;
        length = grid.length;
        if(length !=0){
            width = grid[0].length;
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    search(i,j,grid);
                    islandNum += 1;
                }
            }
        }

        return islandNum;
    }

    static public void search(int x,int y,char grid[][]){
        DFS(x,y,grid);
    }

    static public void DFS(int x,int y,char grid[][]){

        // delete visited
        grid[x][y] = '0';

        // go east
        if(x+1<length&&grid[x+1][y]!='0')DFS(x+1,y,grid);
        // go south
        if(y+1<width&&grid[x][y+1]!='0')DFS(x, y + 1, grid);
        // go west
        if(x-1>=0&&grid[x-1][y]!='0')DFS(x-1, y , grid);
        // go north
        if(y-1>=0&&grid[x][y-1]!='0')DFS(x, y -1, grid);
    }

    static public void test(){
        char [][] a ={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.print(numIslands(a));
    }

}
