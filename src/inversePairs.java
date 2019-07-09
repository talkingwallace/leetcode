public class inversePairs {

    static int count = 0;

    static void merge(int []arr,int s,int mid,int e){
        if(s>=e)return;
        int tmp[] = new int[e-s+1];
        int i = mid,j = e,k = tmp.length-1;
        while(i>=s && j>=mid+1){
            if(arr[i]>arr[j]){
                count += (j-mid);
                System.out.println(count);
                tmp[k--] = arr[i--];
            }
            else{
                tmp[k--] = arr[j--];
            }
        }
        while(i>=s)tmp[k--] = arr[i--];
        while(j>=mid+1)tmp[k--] = arr[j--];
        k = 0;
        while(k<tmp.length){
            arr[s+k] = tmp[k];
            k++;
        }

    }

    static void mergeSort(int[] arr,int start,int end){
        if(end<=start)return;
        int mid = (start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    static public int InversePairs(int [] array) {
        count = 0;
        if(array.length == 0)
            return count;
        mergeSort(array,0,array.length-1);
        return count;
    }
}
