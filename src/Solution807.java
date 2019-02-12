public class Solution807 {

    //Max Increase to Keep City Skyline

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if(grid.length==0)return 0;
        int rowMax[] = new int [grid.length];
        int colMax[] = new int [grid[0].length];

        for(int row =0;row<grid.length;row++){
            for(int col = 0;col<grid[0].length;col++){

                if(grid[row][col]>rowMax[row])rowMax[row] = grid[row][col];
                if(grid[row][col]>colMax[col])colMax[col] = grid[row][col];
            }
        }

        int result = 0;
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                result += (Math.min(rowMax[row],colMax[col])-grid[row][col]);
            }
        }
        return result;
    }
}
