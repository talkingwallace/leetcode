import java.util.Arrays;
import java.util.Arrays.*;

// 在第一列二分查找 如果有小于的数，开始列查找
// 列查找时，如果最后一个数小于目标，就甭找了
public class TwoDArrarySearch {

    static boolean binarySearch(int []array,int target){
        int head = 0;
        int end = array.length - 1;
        while(head<=end){
            int mid = (head+end)/2;
            if(array[mid] == target)return true;
            else if(array[mid]>target){
                end = mid - 1;
            }
            else if(array[mid]<target){
                head = mid + 1;
            }
        }
        return false;
    }

    static boolean colBinarySearch(int target,int [][]arr,int colNum,int height,int width){

        if(colNum>=width || colNum<0)return false;
        if(height==1)return false;
        int head = 0,end = height - 1;
        while(head<=end){
            int mid = (head+end)/2;
            System.out.println("colNum:"+colNum+" "+"mid: "+mid+" "+arr[mid][colNum]);
            if(arr[mid][colNum] == target)return true;
            else if(arr[mid][colNum]>target){
                end = mid - 1;
            }
            else{
                head = mid + 1;
            }
        }

        return false;
    }

    //二维数组查找
    static public boolean Find(int target, int [][] array) {

        if(array == null){
            return false;
        }
        int height = array.length;
        int width = array[0].length;

        int head = 0,end = width - 1;
        while(head<=end){
            int mid = (head+end)/2;
            System.out.println(array[0][mid]);
            if(array[0][mid] == target)return true;
            else if(array[0][mid]<target){
                if(colBinarySearch(target,array,mid,height,width))return true;
                else head = mid + 1;
            }
            else if(array[0][mid]>target){
                end = mid - 1;
            }

        }
        return false;
    }
}
