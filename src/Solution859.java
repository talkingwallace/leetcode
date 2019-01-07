import java.util.HashSet;
import java.util.Set;

public class Solution859 {

    static public boolean buddyStrings(String A, String B) {

        if(A.length()!=B.length())return false;

        char a[] = A.toCharArray();
        char b[] = B.toCharArray();

        if(A.equals(B)){
            Set<Character> s = new HashSet<Character>();
            for(char c:a){
                s.add(c);
            }
            return s.size()<a.length;
        }

        char difA[] = new char[2];
        char difB[] = new char[2];
        int pos = 0; //use to record number of dif, can't exceed 2.

        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                if(pos>=2)return false;
                difA[pos] = a[i];
                difB[pos] = b[i];
                pos++;
            }
        }


        if(difA[0] == difB[1] && difA[1] == difB[0])return true;
        else return false;
    }

    static public void test(){
        System.out.print(buddyStrings("ab","ba"));
    }
}
