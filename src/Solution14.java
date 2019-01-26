public class Solution14{

    static public int testPos(String[] strs,int pos){
        // 1 same / 0 not the same / -1 out of index
        if(pos>=strs[0].length())return -1;
        char c = strs[0].charAt(pos);
        for(int i=0;i<strs.length;i++){
            if(strs[i].charAt(pos)!=c)return 0;
        }
        return 1;
    }

    static public String longestCommonPrefix(String[] strs) {
        String rs = "";
        if(strs.length == 0)return rs;
        int len = strs[0].length(); //最短的那个字符串长度
        int pos = -1;  //前缀长度
        for(String s:strs)if(s.length()<len)len = s.length();

        for(int i=0;i<len;i++){
            if(testPos(strs,i)==0)break;
            pos = i;
        }

        if(strs[0].equals(""))return "";
        else{
            return strs[0].substring(0,pos+1);
        }
    }


    static public void test(){
        System.out.println(longestCommonPrefix(new String[]{"da","a"}));
    }
}
