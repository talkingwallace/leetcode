import java.util.ArrayList;
import java.util.List;

class ComplexNum{

    public int realNum = 0;
    public int imgNum = 0;

    ComplexNum(String in){
        int i=0;

        char str[] = in.toCharArray();

        while(i<str.length){
            String result = "";
            boolean isReal = true;
            if(str[i]=='+')continue;
            if(str[i]=='-'){
                result += "-";
                i++;
            }
            if(i<in.length()&&Character.isDigit(in.charAt(i))){
                while(i<in.length()&&(Character.isDigit(str[i])||str[i]=='i')){
                    if(str[i]=='i')isReal = false;
                    result += str[i]=='i'?"":str[i];
                    i++;
                }
            }
            if(isReal)realNum = Integer.parseInt(result);
            else imgNum = Integer.parseInt(result);
            i++;
        }
    }

    public void print(){
        System.out.print(realNum+"+"+imgNum+"i\n");
    }

    public String multiply(ComplexNum b){
        int realRs = this.realNum*b.realNum + -(this.imgNum*b.imgNum);
        int imgRs = this.imgNum*b.realNum + this.realNum*b.imgNum;
        return realRs+"+"+imgRs+"i";
    }
}

public class Solution537 {


    static public String complexNumberMultiply(String a, String b) {

        return new ComplexNum(a).multiply(new ComplexNum(b));
    }

    static public void test(){
        System.out.print(complexNumberMultiply("1+-1i"
                ,"0+0i"));
    }

}
