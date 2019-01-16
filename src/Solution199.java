import java.util.List;
import java.util.ArrayList;

public class Solution199 {

    static List<Integer> rs = new ArrayList<Integer>();

    static void levelSearch(ArrayList<TreeNode> lvl){
        if(lvl.size()==0)return;
        rs.add(lvl.get(lvl.size()-1).val);
        ArrayList<TreeNode> nxtLvl = new ArrayList<TreeNode>();
        for(TreeNode n:lvl){
            if(n.left!=null)nxtLvl.add(n.left);
            if(n.right!=null)nxtLvl.add(n.right);
        }
        levelSearch(nxtLvl);
    }

    public List<Integer> rightSideView(TreeNode root) {
        rs = new ArrayList<Integer>();
        if(root == null)return rs;
        ArrayList<TreeNode> lvl = new ArrayList<TreeNode>();
        lvl.add(root);
        levelSearch(lvl);
        return rs;
    }

    // smart solution
//    public List<Integer> rightSideView(TreeNode root) {
//        List<Integer> rightView = new ArrayList<>();
//        dfs(root, rightView, 0);
//        return rightView;
//    }
//    public void dfs(TreeNode curr, List<Integer> rightView, int index){
//        if(curr == null){
//            return;
//        }
//        while(index==rightView.size()){
//            rightView.add(curr.val);
//        }
//
//        dfs(curr.right, rightView, index+1);
//        dfs(curr.left, rightView, index+1);
//    }

}
