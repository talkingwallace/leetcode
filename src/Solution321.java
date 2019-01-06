public class Solution321 { //  Actually it's 821

    static public int[] shortestToChar(String S, char C) {

        int infinite = -10001;

        int l[] = new int[S.length()];
        int r[] = new int[S.length()];
        int rs[] = new int[S.length()];

        // left shortest
        int Cpos = infinite;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == C){
                Cpos = i;
            }
            l[i] = Math.abs(i - Cpos);
        }
        // right shortest
        int Cpost = infinite;
        for(int i=S.length()-1;i>=0;i--){
            if(S.charAt(i) == C){
                Cpos = i;
            }
            r[i] = Math.abs(i - Cpos);
        }
        // combine result
        for(int i=0;i<S.length();i++){
            rs[i] = Math.min(l[i],r[i]);
        }

        return rs;
    }

    static void test(){
        String s = "loveleetcode";
        char C = 'e';
        int []rs = Solution321.shortestToChar(s,C);
        for(int i:rs){
            System.out.print(i+" ");
        }
    }
}
