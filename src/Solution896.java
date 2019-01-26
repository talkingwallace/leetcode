public class Solution896 {

    static boolean isIncre = true;

    public boolean isMonotonic(int[] A) {

        if(A.length==0||A.length==1)return true;

        int pre = A[0];
        int status = 0;
        for(int i=1;i<A.length;i++){
            int diff = A[i]-pre;
            if(diff>0){
                if(status == 0||status==1)status = 1;
                else return false;
            }
            else if(diff<0){
                if(status == 0||status==-1)status = -1;
                else return false;
            }
            pre = A[i];
        }

        return true;
    }
}
