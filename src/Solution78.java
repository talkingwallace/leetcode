import java.util.ArrayList;
import java.util.List;

public class Solution78 {

    //位向量法 位向量发很简单，但是代价也很高

    //增量构造法
    //https://www.jianshu.com/p/675a6b5ecbca
    static ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();

    static public void IncreConstruct(int cur,int idx[],int nums[]){

        ArrayList<Integer> rs = new ArrayList<Integer>();
        for(int i=0;i<cur;i++){
            rs.add(nums[idx[i]-1]);
        }
        result.add(rs);
        int s = 0;
        if(cur==0){
            s = 1;
        }
        else{
            s = idx[cur-1]+1;
        }
        for(int i = s;i<=nums.length;i++){
            idx[cur] = i;
            IncreConstruct(cur+1,idx,nums);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        if(nums.length==0)return null;
        result = new ArrayList<List<Integer>>();
        IncreConstruct(0,new int[nums.length],nums);
        return result;
    }
}
