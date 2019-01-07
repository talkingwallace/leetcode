import java.util.*;

public class Solution890 {

//    static public boolean match(char t[],char []pattern){
//
//        if(t.length!=pattern.length)return false;
//
//        Map<Character,Character> m = new HashMap<Character, Character>();
//        Map<Character,Character> m2 = new HashMap<Character, Character>();
//
//        for(int i=0;i<t.length;i++){
//            if(!m.containsKey(t[i])&&!m2.containsKey(pattern[i])){
//                m.put(t[i],pattern[i]);
//                m2.put(pattern[i],t[i]);
//            }
//            else if(m.containsKey(t[i])&&m2.containsKey(pattern[i])){
//                if(m.get(t[i])!=pattern[i])return false;
//            }
//            else{
//                return false;
//            }
//        }
//
//        return true;
//    }

    static public boolean match(char t[],char []pattern){

        if(t.length!=pattern.length)return false;

        int []tokens = new int[256];
        boolean []used = new boolean[256];

        for(int i=0;i<t.length;i++){
            if(tokens[t[i]+0] == 0&& !used[pattern[i]+0]){
                tokens[t[i]+0] = pattern[i]+0;
                used[pattern[i]+0] = true;
            }
            else if(tokens[t[i]+0]!=0&&used[pattern[i]]){
                if(tokens[t[i]+0] != pattern[i]+0)return false;
            }
            else{
                return false;
            }
        }

        return true;
    }

    static public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> rs = new ArrayList<String>();
        char p[] = pattern.toCharArray();
        for(String s:words){
            if(match(s.toCharArray(),p)){
                rs.add(s);
            }
        }
        return rs;
    }

    static public void test(){

    }
}
