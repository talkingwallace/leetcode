public class Solution973 {

    static public void idxQS(int idx[],int array[],int lo,int hi){
        if(lo>=hi)return;
        int key = array[idx[lo]];
        int pivot = idx[lo];
        int loB = lo,hiB = hi;
        while(lo<hi){
            while(array[idx[hi]]>=key&&hi>lo)hi--;
            idx[lo] = idx[hi];
            while(array[idx[lo]]<=key&&hi>lo)lo++;
            idx[hi] = idx[lo];
        }
        idx[hi] = pivot;
        idxQS(idx,array,loB,hi-1);
        idxQS(idx,array,hi+1,hiB);
    }

    static public int[][] kClosest(int[][] points, int K) {

        int idx[] = new int [points.length];
        int rs[][] = new int[K][2];
        for(int i=0;i<idx.length;i++)idx[i] = i;
        int val[] = new int[points.length];
        for(int i=0;i<idx.length;i++){
            val[i] = (int)(Math.pow(points[i][0],2)+Math.pow(points[i][1],2));
        }
        idxQS(idx,val,0,idx.length-1);
        for(int i=0;i<K;i++){
            rs[i] = points[idx[i]];
        }
//        for(int i=0;i<idx.length;i++){
//            System.out.println(val[idx[i]]);
//        }
        return rs;
    }
}
