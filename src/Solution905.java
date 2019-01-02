public class Solution905 {

    static public int countEven(int []A){
        int count = 0;
        for(int i=0;i<A.length;i++){
            count += A[i]%2 == 1?0:1;
        }
        return count;
    }

    //fastest solution
//    public int[] sortArrayByParity(int[] A) {
//
//        int[] tab = new int[A.length];
//        int first = 0;
//        int last = A.length-1;
//
//        for(int i = 0; i<A.length; i++){
//            if(A[i]%2==0){
//                tab[first]=A[i];
//                first++;
//            }
//            else{
//                tab[last] = A[i];
//                last--;
//            }
//        }
//        return tab;
//    }

    public int[] sortArrayByParity(int[] A) {
        int evenNum = countEven(A);
        int o = evenNum-1;
        for(int e=0;e<evenNum;e++){
            if((A[e]%2 == 1)) {
                while(o<A.length){
                    o++;
                    if(!(A[o]%2 == 1)) {
                        int tmp = A[o];
                        A[o] = A[e];
                        A[e] = tmp;
                        break;
                    }
                }
            }
        }
        return A;
    }

    static void test(){
        int a[] = {3,1,2,4};
    }
}
