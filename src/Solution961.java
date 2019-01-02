import java.util.HashMap;
import java.util.HashSet;

public class Solution961 {

//    static public int repeatedNTimes(int[] A) {
//
//        int length = A.length/2;
//        HashMap count = new HashMap();
//        for(int i=0;i<A.length;i++){
//            if(count.containsKey(A[i])){
//                int newVal = ((int)count.get(A[i])+1);
//                if(newVal>=length){
//                    return A[i];
//                }
//                count.put(A[i],newVal);
//            }
//            else{
//                count.put(A[i],1);
//            }
//        }
//        return -1;
//    }

    static public int repeatedNTimes(int[] a){

        HashSet count = new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(count.contains(a[i])){
                return a[i];
            }
            else{
                count.add(a[i]);
            }
        }
        return -1;
    }

    static public void test(){
        int a[] = {5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(a));
    }
}
