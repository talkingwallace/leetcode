import java.util.ArrayList;
import java.util.List;


class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};


public class Solution590 {

    static  List<Integer> rs = new ArrayList<Integer>();

    public void visit(Node node){
        if(node == null)return;
        rs.add(node.val);
        for(Node n:node.children)visit(n);
    }

    public List<Integer> postorder(Node root) {
        rs = new ArrayList<Integer>();
        visit(root);
        return rs;
    }

}
