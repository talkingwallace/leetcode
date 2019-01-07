public class Solution125 {

    static public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        char S[] = s.toCharArray();
        int start = 0, end = S.length-1;
        while(start<end){

            while(!(Character.isAlphabetic(S[start])||Character.isDigit(S[start]))){
                start++;
                if(start>=s.length())return true;
            }

            while(!(Character.isAlphabetic(S[end])||Character.isDigit(S[end]))){
                end--;
                if(end<0)return true;
            }

            if(S[start]!=S[end])return false;

            start++;
            end--;
        }

        return true;
    }

    static public void test(){
        String str = ".,";
        System.out.print((double)('a'+1));
    }
}
