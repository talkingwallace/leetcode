public class Solution202 {


    public int decompose(int num){
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum += (int)Math.pow(digit,2);
            num = (int)num/10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        //no i m not happy at all
        while(true){
            int sum = decompose(n);
            if(sum>1&&sum!=4) n = sum;
            else if(sum==4)return false;
            else if(sum==1)break;
        }
        return true;
    }
}
