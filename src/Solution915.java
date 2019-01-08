public class Solution915 {
    static public int partitionDisjoint(int[] A) {


        int pos = 0;
        int []leftMax = new int[A.length+2];
        int []rightMin = new int[A.length+2];

        int lmax = -1; // A[i]>=0
        leftMax[0] = -1;
        for(int i=0;i<A.length;i++){
            if(A[i]>lmax){
                leftMax[i+1] = A[i];
                lmax = A[i];
            }
            else{
                leftMax[i+1] = lmax;
            }
        }
        leftMax[A.length-1] = lmax;

        int rmin = 30001; // A[i]>30000;
        rightMin[A.length+1] = rmin;
        for(int i=A.length-1;i>=0;i--){
            if(A[i]<rmin){
                rmin = A[i];
                rightMin[i+1] = rmin;
            }
            else{
                rightMin[i+1] = rmin;
            }
        }
        rightMin[0] = rmin;

        for(int i=1;i<A.length+1;i++){
            if(rightMin[i]>=leftMax[i]){
                System.out.println("nmsl?"+i);
                pos = i+1;
                break;
            }
        }


        for(int i=0;i<leftMax.length;i++){
            System.out.print(leftMax[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<leftMax.length;i++){
            System.out.print(rightMin[i]+" ");
        }
        System.out.println("");

        return pos;
    }

    static public void test(){
        System.out.println(partitionDisjoint(new int[]{1,1,1,0,6,12}));
    }

}
