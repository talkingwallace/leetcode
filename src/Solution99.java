import java.util.List;
import java.util.ArrayList;

public class Solution99 {

    static List<TreeNode> iol = new ArrayList<TreeNode>();// inorder list

    static void visit(TreeNode node){
        if(node == null)return;
        visit(node.left);
        iol.add(node);
        visit(node.right);
    }

    public void recoverTree(TreeNode root) {
        if(root==null)return;
        iol = new ArrayList<TreeNode>();// inorder list
        visit(root);

        for(int i=0;i<iol.size();i++){
            if(i+1<iol.size()&&iol.get(i).val>iol.get(i+1).val){

                while(i>=0&&iol.get(i).val>iol.get(i+1).val){
                    int tmp = iol.get(i).val;
                    iol.get(i).val = iol.get(i+1).val;
                    iol.get(i+1).val = tmp;
                }

                break;
            }
        }
    }
}
