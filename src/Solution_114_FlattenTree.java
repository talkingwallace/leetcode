import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Solution_114_FlattenTree {

    static List<TreeNode> rs = new ArrayList<TreeNode>();

    // preorder
    public static void visit(TreeNode n){
        if(n==null)return;
        rs.add(n);
        visit(n.left);
        visit(n.right);
    }

    public static void flatten(TreeNode root) {

        // initialize
        rs = new ArrayList<TreeNode>();
        if(root == null)return;
        //Traverse
        visit(root);

        //Transform
        for(int i=0;i+1<rs.size();i++){
            TreeNode pre = rs.get(i);
            TreeNode aft = rs.get(i+1);
            pre.right = aft;
            pre.left = null;
        }
        rs.get(rs.size()-1).right = null;
    }

    static TreeNode pre = null;

    static void traverse(TreeNode node){

        if(node == null)return;
        TreeNode tmp = node.right; //因为右节点可能在后面遍历时被替换，所以用一个临时变量先保存[1]

        if(pre != null){
            pre.right = node; //[1]
            pre.left = null;
        }
        pre = node;
        traverse(node.left);
        traverse(tmp);
    }

    public static void flatten2(TreeNode root) { //version 2 without an array list

        // initialize
        rs = new ArrayList<TreeNode>();
        if(root == null)return;
        //Traverse
        traverse(root);
    }
}
