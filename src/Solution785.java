import java.util.Queue;
import java.util.LinkedList;

public class Solution785 {

    static Queue<Integer> q = new LinkedList<Integer>();
    static int color[];

    static public boolean bfs(int [][]graph){

        color[0] = 1;  //dye
        q.add(0);
        while(!q.isEmpty()){
            int head = q.poll();
            for(int i:graph[head]){
                if(color[i]==-1){
                    color[i] = 1 - color[head];
                    q.add(i);
                }
                else {
                    if(color[i]==color[head])return false;
                }
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {

        if(graph.length==0)return false;
        color = new int[graph.length];
        q = new LinkedList<Integer>();
        return bfs(graph);
    }
}
