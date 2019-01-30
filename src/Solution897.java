import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;

public class Solution897 {

    //solution1 我佛了 你把问题想复杂了
//    static TreeNode construct(TreeNode n,boolean isRoot){
//        if(n==null)return null;
//        if(n.left==null&&n.right==null)return n;
//        TreeNode pre = construct(n.left,false);
//        pre.right = n;
//        if(isRoot){
//            n.right = constructRight(n.right);
//            return n;
//        }
//        if(n.right!=null)return construct(n.right,false);
//        return n;
//    }
////
//    static TreeNode constructRight(TreeNode n){
//        if(n==null)return null;
//        if(n.left == null&& n.right == null)return n;
//        n.right = constructRight(n.right);
//        if(n.left!=null)return n.left;
//        else return n;
//    }//?????


    //solution2 此方法超时了
//    ArrayList<TreeNode> easy = new ArrayList<TreeNode>();
//
//    public void inorder(TreeNode n){
//        if(n==null)return ;
//        inorder(n.left);
//        easy.add(n);
//        inorder(n.right);
//    }

    //solution 3 the post-apocalypse ultimate solution

    TreeNode globalR,globalT; //global root;global tail
    boolean visitMostLeft =false;

    public void visit(TreeNode n){
        if(n==null)return;
        visit(n.left);
        if(n.left==null&&n.right==null&&visitMostLeft==false){
            globalR = n;
            globalT = n;
            visitMostLeft = true;
        }
        else{
            globalT.right = n;
            globalT.left = null;
            globalT = n;
        }
        visit(n.right);
    }

    public TreeNode increasingBST(TreeNode root) {

        if(root==null)return null;
        visitMostLeft = false;
        globalT = null;
        globalR = null;

        visit(root);

        return globalR;
    }
}
