import java.util.HashMap;

public class Fibonacci {

    public static HashMap<Integer,Integer> store = new HashMap<Integer, Integer>();

    static public int Fibonacci(int n) {
        if(n==0)return -1;
        if(n==1)return 1;
        if(n==2)return 1;
        else{
            if(store.containsKey(n))return store.get(n);
            else{
                int result = Fibonacci(n-1) + Fibonacci(n-2);
                store.put(n,result);
                return result;
            }
        }
    }

}
