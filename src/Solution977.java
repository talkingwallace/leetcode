import java.util.*;

public class Solution977 {

    public int[] sortedSquares(int[] A) {
        int result[] = new int[A.length];
        int count = 0;
        for(int i:A){
            result[count++] = i*i;
        }
        Arrays.sort(result);
        return result;
    }
}
