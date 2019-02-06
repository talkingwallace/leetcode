public class subSets {


    //增量构造法

    public static void subset(int n, int A[], int cur) {
        for (int i = 0; i < cur; i++)
            System.out.printf("%d", A[i]);//打印当前集合
        System.out.println();
        int s;
        if (cur != 0) //如果cur=0，则从1开始，cur！=0，从A[cur - 1] + 1开始，由于数组坐标性质决定的
            s = A[cur - 1] + 1;
        else
            s = 1;
        for (int i = s; i <= n; i++) {
            A[cur] = i;
            subset(n, A, cur + 1);//递归构造子集
        }

    }

    public static void test() {
        int n = 4;
        int A[] = new int [n];
        subset(n, A, 0);
    }
}
