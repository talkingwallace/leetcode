import sun.reflect.generics.tree.Tree;

public class Solution450 {


    TreeNode deleteMin(TreeNode node){
        if(node.left==null)return node.right;
        node.left = deleteMin(node.left);
        return node;
    }

    TreeNode min(TreeNode node){
        if(node.left==null)return node;
        else return min(node.left);
    };

    TreeNode delete(TreeNode node,int key){
        if(node == null)return null;
        if(node.val>key)node.left = delete(node.left,key);
        else if(node.val<key)node.right = delete(node.right,key); // else if is important!!!!! if may cause problem
        else{
            if(node.left==null)return node.right;
            if(node.right==null)return node.left;
            TreeNode tmp = node;
            node = min(node.right);
            node.right = deleteMin(tmp.right);
            node.left = tmp.left;
        }
        return node;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        return delete(root,key);
    }
}
