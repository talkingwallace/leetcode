public class QS {

    //my quick sort
    // wrong
//    static void MyQS(int val[],int low,int high){
//        if(low>=high)return;
//
//        int start = low+1,end = high;
//        while(start<end){
//
//            while(end>start&&val[end]>=val[low])end--;
//
//            while(end>start&&val[start]<val[low])start++;
//
//            if(start>=end)break;
//
//            int tmp = val[start];
//            val[start] = val[end];
//            val[end] = tmp;
//        }
//        if(end==low+1||start==high){
//
//        }
//        else{
//            int tmp = val[low];
//            val[low] = val[end];
//            val[end] = tmp;
//        }
//
//        MyQS(val,low,end-1);
//        MyQS(val,end+1,high);
//    }

    // correct
    static void myQs(int array[],int lo,int hi){

        if(lo>=hi)return;
        int key = array[lo];
        int loB = lo,hiB = hi;
        while(lo<hi){
            while(array[hi]>=key&&hi>lo)hi--;
            array[lo] = array[hi];
            while(array[lo]<=key&&hi>lo)lo++;
            array[hi] = array[lo];
        }
        array[hi] = key;
        myQs(array,loB,hi-1);
        myQs(array,hi+1,hiB);
    }

    static void test(){
        System.out.print("nimasile");
        int a[] = new int[]{1,2,3,3,4,5};
        myQs(a,0,a.length-1);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
