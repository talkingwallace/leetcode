public class Soluton695 {

    static int length = 0;
    static int width = 0;

    static public int maxAreaOfIsland(int[][] grid) {

        length = grid.length;
        if(length !=0){
            width = grid[0].length;
        }

        int maxArea = 0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    int area = search(i,j,grid);
                    if(area>maxArea)maxArea = area;
                }
            }
        }

        return maxArea;
    }

    static public int search(int x,int y,int grid[][]){
        return DFS(x,y,grid);
    }

    static public int DFS(int x,int y,int grid[][]){

        // delete visited
        grid[x][y] = 0;

        int area = 1;

        // go east
        if(x+1<length&&grid[x+1][y]!=0)area += DFS(x+1,y,grid);
        // go south
        if(y+1<width&&grid[x][y+1]!=0)area += DFS(x, y + 1, grid);
        // go west
        if(x-1>=0&&grid[x-1][y]!=0)area += DFS(x-1, y , grid);
        // go north
        if(y-1>=0&&grid[x][y-1]!=0)area += DFS(x, y -1, grid);

        return area;
    }

    static public void test(){
//        int [][]grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
//                {0,0,0,0,0,0,0,1,1,1,0,0,0},
//                {0,1,1,0,1,0,0,0,0,0,0,0,0},
//                {0,1,0,0,1,1,0,0,1,0,1,0,0},
//                {0,1,0,0,1,1,0,0,1,1,1,0,0},
//                {0,0,0,0,0,0,0,0,0,0,1,0,0},
//                {0,0,0,0,0,0,0,1,1,1,0,0,0},
//                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int [][]grid = {{0,0,0,0,0}};
        System.out.print(maxAreaOfIsland(grid));
    }

}
