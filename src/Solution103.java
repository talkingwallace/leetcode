import java.util.List;
import java.util.ArrayList;

public class Solution103 {

    static List<List<Integer>> rs = new ArrayList<List<Integer>>();

    static void levelSearch(ArrayList<TreeNode> lvl,boolean lToR){
        if(lvl.size()==0)return;
        ArrayList<TreeNode> nxtLvl = new ArrayList<TreeNode>();
        ArrayList<Integer> tmpRs = new ArrayList<Integer>();
        for(int i=0;i<lvl.size();i++){
            TreeNode n = lvl.get(i);
            if(n.left!=null)nxtLvl.add(n.left);
            if(n.right!=null)nxtLvl.add(n.right);
        }
        if(lToR){
            for(int i=0;i<lvl.size();i++){
                TreeNode n = lvl.get(i);
                tmpRs.add(n.val);
            }
        }
        else{
            for(int i=lvl.size()-1;i>=0;i--){
                TreeNode n = lvl.get(i);
                tmpRs.add(n.val);
            }
        }
        rs.add(tmpRs);
        levelSearch(nxtLvl,!lToR);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        rs = new ArrayList<List<Integer>>();
        if(root == null)return rs;
        ArrayList<TreeNode> lvl = new ArrayList<TreeNode>();
        lvl.add(root);
        levelSearch(lvl,true);
        return rs;
    }
}
