public class Solution557 {

    static public String reverse(String s){
        char rs[] = s.toCharArray();
        int start = 0,end = s.length()-1;
        while(start<end){
            char tmp = rs[start];
            rs[start] = rs[end];
            rs[end] = tmp;
            start++;
            end--;
        }
        return new String(rs);
    }

    static public String reverseWords(String s) {

        String []strs = s.split(" ");
        if(strs.length==0)return s;
        String result = "";
        for(int i=0;i<strs.length;i++){
            result+=reverse(strs[i]);
            if(i!=strs.length-1){
                result+=" ";
            }
        }

        return result;
    }
}
