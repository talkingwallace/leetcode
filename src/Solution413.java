import java.util.HashMap;
import java.util.Map;

public class Solution413 {

    static Map<Integer,Integer> lookUp = new HashMap<Integer, Integer>();

    public int subArrNum(int n){ // number of sub arithmetic slices
        if(n==3)return 1;
        if(n==4)return 3;
        else if(lookUp.containsKey(n))return lookUp.get(n);
        else{
            return 2*subArrNum(n-1)+1-subArrNum(n-2);
        }
    }

    public int numberOfArithmeticSlices(int[] A) {
        if (A.length < 3) return 0;
        int sum = 0;
        int count = 0;
        int dist = 0;
        for (int i = 0; i < A.length; i++) {
            if (i + 1 < A.length) {
                int tmp = A[i + 1] - A[i];
                if (tmp == dist) count++;
                else {
                    dist = tmp;
                    if (count >= 2) sum += subArrNum(count + 1);
                    count = 1;
                }
            }
        }
        if (count >= 2) sum += subArrNum(count + 1);
        return sum;
    }

}
