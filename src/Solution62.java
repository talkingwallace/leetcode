public class Solution62 {

    static int map[][] = null;

    static int countPath(int x,int y){
        
    }

    public int uniquePaths(int m, int n) {
        if(m==0&&n==0)return 0;
        if(m==0||n==0)return m==0?n:m;

        map = new int[m][n];


        return map[m-1][n-1];
    }
}
