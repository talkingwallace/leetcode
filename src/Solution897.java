public class Solution897 {


    static TreeNode construct(TreeNode n,boolean isRoot){
        if(n==null)return null;
        if(n.left==null&&n.right==null)return n;
        construct(n.left,false).right = n;
        if(isRoot){
            n.right = constructRight(n.right);
            return n;
        }
        if(n.right!=null)return construct(n.right,false);
        return n;
    }

    static TreeNode constructRight(TreeNode n){
        if(n==null)return null;
        if(n.left == null&& n.right == null)return n;
        n.right = constructRight(n.right);
        if(n.left!=null)return n.left;
        else return n;
    }//?????

    public TreeNode increasingBST(TreeNode root) {

    }
}
