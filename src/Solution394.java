public class Solution394 {


    //为了以后看这个的人（包括我），我还是上个注释好了
    // isChecked 看输入的每个字符是否被使用过
    // build方法建立一个串，如果遇到[，在此调用build，相当于进栈，
    // 因为isChecked记录了每个位是否被访问过，所以每个build方法遇到的 ]一定是对应其开始的那个[
    // 一开始调用时， num =1, curIndex = 0， 最终结果保存在build中

    static boolean isChecked[];

    static String build(char buildStr[],int curIndex,int num){
        String build = "";
        String result = "";

        if(curIndex>=buildStr.length)return "";

        for(int i=curIndex;i<buildStr.length;i++){

            if(isChecked[i]==true)continue;

            isChecked[i] = true;
            if(buildStr[i]==']'){
                String tmpRs = "";
                for(int j=0;j<num;j++){
                    result += build;
                }
                break;
            }
            else if(Character.isDigit(buildStr[i])){
                int newNum = 0;
                while(buildStr[i]!='['){
                    newNum*=10;
                    newNum += buildStr[i]-'0';
                    i++;
                }
                isChecked[i] = true;
                build += build(buildStr,i+1,newNum);
            }
            else{
                build += buildStr[i];
            }
        }
        if(result.equals("")&&!build.equals(""))return build;
        return result;
    }

    static public String decodeString(String s) {

        if(s.length()==0)return "";
        isChecked = new boolean[s.length()];

//        int i = 0,num = 0;
        char buildStr[] = s.toCharArray();
//        while(buildStr[i]!='['){
//            num*= 10;
//            num += buildStr[i] - '0';
//            i++;
//        }
        String result = build(buildStr,0,1);
        return result;
    }
}
