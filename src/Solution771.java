import java.util.HashMap;

public class Solution771 {

    static int table[] = new int[128];

    public int numJewelsInStones(String J, String S) {

        table = new int[128];
        int result = 0;
        char j[] = J.toCharArray();
        for(char i:j){
            table[i-'A'] = 1;
        }
        char s[] = S.toCharArray();
        for(char i:s){
            if(table[i-'A']==1)result++;
        }
        return result;
    }
}
