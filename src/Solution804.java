import java.util.HashSet;

public class Solution804 {

    public int uniqueMorseRepresentations(String[] words) {
        String Morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> count = new HashSet<String>();

        for(String s:words){
            char str[] = s.toCharArray();
            String rs = "";
            for(char c:str){
                rs += Morse[c-'a'];
            }
            count.add(rs);
        }
        return count.size();
    }

    static public int lengthOfLastWord(String s) {
        char cs[] = s.toCharArray();
        if(cs.length==0)return 0;
        int len = 0;
        for(int i=cs.length-1;i>=0;i--){
            if(cs[i]==' '){
                return len;
            }
            len ++;
        }
        return len;
    }

    static public void test(){
        System.out.println(lengthOfLastWord("a "));
    }

}
