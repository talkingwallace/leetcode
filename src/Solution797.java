import java.util.LinkedList;
import java.util.List;

public class Solution797 {

    static LinkedList<Integer> pathList = new LinkedList<Integer>();

    static LinkedList<List<Integer>> rs = new LinkedList<List<Integer>>();

    public static LinkedList<Integer> deepcopy(LinkedList<Integer> tg){
        LinkedList<Integer> d = new LinkedList<Integer>();
        for(int i:tg){
            d.add(i);
        }
        return d;
    }

    public void DFS(int[][] graph,int curNode,int target){

        // for(int i:pathList){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        pathList.add(curNode);
        if(curNode == target){
            rs.add(deepcopy(pathList));
            pathList.remove(pathList.size()-1);
            return ;
        }
        for(int i:graph[curNode]){
            DFS(graph,i,target);
        }
        pathList.remove(pathList.size()-1);
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        rs = new LinkedList<List<Integer>>();
        if(graph.length == 0)return rs;
        DFS(graph,0,graph.length-1);
        return rs;
    }
}
