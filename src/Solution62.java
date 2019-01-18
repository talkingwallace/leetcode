public class Solution62 {

    static int map[][] = null;

    public int uniquePaths(int m, int n) {
        System.out.println(m+" "+n);
        if(m==0&&n==0)return 0;
        if(m==0||n==0)return m==0?n:m;

        map = new int[m][n];
        map[0][0] = 1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i-1>=0&&j-1>=0){
                    map[i][j] += map[i-1][j];
                    map[i][j] += map[i][j-1];
                }
                else if(i-1>=0)map[i][j] += map[i-1][j];
                else if(j-1>=0)map[i][j] += map[i][j-1];

            }
        }

        return map[m-1][n-1];
    }

    // the quickest version on leetcode
//    public int uniquePaths(int m, int n) {
//        //down, right, how many unique paths
//        // dynamic programming functional equation, initial state,coordinate,point
//        //f(x, y) = f(x-1, y) + f(x, y-1)--; f(0,0) = 1, f(x, 0) = 1; f(0, y) = 1;; answer f(m-1,n-1)
//        int[][] f = new int[2][n];
//        f[0][0] = 1;
//        int old = 0, now = 0;
//        for (int i = 0; i < m; i++) {
//            //O(m*n) -> O(2n),
//            old = now;
//            now = 1 - old;
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || j == 0) {
//                    f[now][j] = 1;
//                    continue;
//                }
//
//                f[now][j] = f[old][j] + f[now][j-1];
//            }
//        }
//
//        return f[now][n - 1];
//    }
}
