class Solution70{

    static int rs=0; // 解的个数

    static void climb(int cur,int len,int n){
        if(cur+len==n){
            rs+=1;
            return;
        }
        if(cur+len>n){
            return;
        }
        if(cur+len<n){
            climb(cur+len,1,n);
            climb(cur+len,2,n);
        }
    }

    static public int climbStairs(int n) {

        rs = 0;

        climb(0,1,n);
        climb(0,2,n);

        return rs;
    }

    public static void test(){
        System.out.print(climbStairs(3));
    }
}
