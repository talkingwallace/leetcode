public class Solution796 {

//    public boolean rotateString(String A, String B) {
//        return A.length() == B.length() && (A + A).contains(B);
//    }

    public boolean rotateString(String A, String B) {

        for(int i=0;i<B.length();i++){
            if(A.charAt(0) == B.charAt(i)){
                if(match(A,B,i)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean match(String A,String B,int startPoint){

        for(int i=0;i<A.length();i++){
            if(A.charAt(i) != B.charAt((startPoint+i)%A.length())){
                return false;
            }
        }

        return true;
    }

}
