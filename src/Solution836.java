public class Solution836 {


    //这个完全搞不懂 智商不够用
//    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
//        return !(rec1[2] <= rec2[0] ||   // left
//                rec1[3] <= rec2[1] ||   // bottom
//                rec1[0] >= rec2[2] ||   // right
//                rec1[1] >= rec2[3]);    // top
//    }

    // another solution using area computation
    public boolean isRectangleOverlap(int[] rec1, int[] rec2){
        int width = Math.min(rec1[2],rec2[2]) - Math.max(rec1[0],rec2[0]);
        int height = Math.min(rec1[3],rec2[3]) - Math.max(rec1[1],rec2[1]);
        if(width>0&&height>0)return true;
        else return false;
    }
}
