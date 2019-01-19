import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution343 {

    static public Map<Integer,Integer> lookUp = new HashMap<Integer, Integer>();

    static public int breakInt(int n){
        if(n==2)return 1;
        if(n==3)return 2;
        if(n==4)return 4;
        if(lookUp.containsKey(n))return lookUp.get(n);
        else{
            int max = 0;
            for(int i=2;i<=n;i++){

                int left = i;
                int right = n-i; //divided into two parts
                                  // if left larger than right, then stops doing repeated works.
                if(i>n-i)break;
                max = Math.max(max,breakInt(left)+breakInt(right));
            }
            lookUp.put(n,max);
            return max;
        }
    }

    public int integerBreak(int n) {
        return breakInt(n);
    }

    //a fast solution
//    public int integerBreak(int n) {
//        if(n==2)
//            return 1;
//        else if(n==3)
//            return 2;
//        else if(n%3==0){
//            int num=n/3;
//            return (int)Math.pow(3,num);
//        }
//
//        else if(n%3==1){
//            int num=(n-4)/3;
//            return 2*2*(int)Math.pow(3,num);
//        }
//
//        else{
//            int num=n/3;
//            return 2*(int)Math.pow(3,num);
//        }
//    }
}
/*
I saw many solutions were referring to factors of 2 and 3. But why these two magic numbers? Why other factors do not work?
Let's study the math behind it.

For convenience, say n is sufficiently large and can be broken into any smaller real positive numbers. We now try to calculate which real number generates the largest product.
Assume we break n into (n / x) x's, then the product will be xn/x, and we want to maximize it.

Taking its derivative gives us n * xn/x-2 * (1 - ln(x)).
The derivative is positive when 0 < x < e, and equal to 0 when x = e, then becomes negative when x > e,
which indicates that the product increases as x increases, then reaches its maximum when x = e, then starts dropping.

This reveals the fact that if n is sufficiently large and we are allowed to break n into real numbers,
the best idea is to break it into nearly all e's.
On the other hand, if n is sufficiently large and we can only break n into integers, we should choose integers that are closer to e.
The only potential candidates are 2 and 3 since 2 < e < 3, but we will generally prefer 3 to 2. Why?

Of course, one can prove it based on the formula above, but there is a more natural way shown as follows.

6 = 2 + 2 + 2 = 3 + 3. But 2 * 2 * 2 < 3 * 3.
Therefore, if there are three 2's in the decomposition, we can replace them by two 3's to gain a larger product.

All the analysis above assumes n is significantly large. When n is small (say n <= 10), it may contain flaws.
For instance, when n = 4, we have 2 * 2 > 3 * 1.
To fix it, we keep breaking n into 3's until n gets smaller than 10, then solve the problem by brute-force.
 */