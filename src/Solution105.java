public class Solution105 {

    //根据中序得到左右关系，根据长度切割前序，分开构建子树

    static int[] pre,in;

    public TreeNode construct(int ps,int pe,int is,int ie){ //pre start and end, in start and end

        if(ps>=pre.length||ps<0)return null;
        if(ps>pe)return null;

        TreeNode n = new TreeNode(pre[ps]);
        int mid = 0;
        for(int i=is;i<=ie;i++){
            if(in[i]==pre[ps]){
                mid=i;
                break;
            }
        }

        int dist1 = mid - is; //前序长度
        int preS1 = ps+1,preE1 = ps+dist1;

        n.left = construct(preS1,preE1,is,mid-1);
        n.right = construct(preE1+1,pe,mid+1,ie);
        return n;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if(preorder.length==0)return null;
        pre = preorder;
        in = inorder;
        return construct(0,pre.length-1,0,in.length-1);
    }

}
