public class Solution814 {

    //修剪树应该考虑到的情况: 左子树无1 柚子树无1 本身不是1,如果三者都满足，父节点只能把这一支删掉
    public boolean visit(TreeNode node){
        if(node==null)return false;
        if(node.left==null&&node.right==null){
            if(node.val==0)return false;
            else return true;
        }
        boolean l = visit(node.left);
        boolean r = visit(node.right);
        if(!l)node.left = null;
        if(!r)node.right = null;
        return node.val == 1||(l||r);
    }

    public TreeNode pruneTree(TreeNode root) {
        if(root==null)return null;
        visit(root);
        return root;
    }
}
