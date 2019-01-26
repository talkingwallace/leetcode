import sun.reflect.generics.tree.Tree;

public class Solution106 {

    static int []post,in;

    static TreeNode construct(int is,int ie,int ps,int pe){
        if(pe<0||pe>=post.length||ps>pe)return null;
        TreeNode n = new TreeNode(post[pe]);
        int midIdx = 0;
        for(int i=is;i<=ie;i++){
            if(in[i] == post[pe]){
                midIdx = i;
                break;
            }
        }
        int dist = ie - midIdx;
        n.right = construct(midIdx+1,ie,pe-dist,pe-1);
        n.left = construct(is,midIdx-1,ps,pe-dist-1);
        return n;
    }

    static public TreeNode buildTree(int[] inorder, int[] postorder) {

        if(inorder.length==0)return null;
        in = inorder;
        post = postorder;

        return construct(0,inorder.length-1,0,postorder.length-1);
    }
}
