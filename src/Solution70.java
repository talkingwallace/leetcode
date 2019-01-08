class Solution70{ //这就是个Fibonacci数列

    static int rs=0; // 解的个数

    static int Fibonacci(int n){
        if(n==1)return 1;
        if(n==2)return 2;
        int n_1 = 1;
        int n_2 = 2;
        int rs=0;
        for(int i=2;i<n;i++){
            rs = n_2 + n_1;
            n_1 = n_2;
            n_2 = rs;
        }
        return rs;
    }

    static public int climbStairs(int n) {
        return Fibonacci(n);
    }

    public static void test(){
        System.out.print(climbStairs(4));
    }
}
