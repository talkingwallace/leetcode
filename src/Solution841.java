import java.util.ArrayList;
import java.util.List;

public class Solution841 {

    public void visit(List<Integer> room,boolean[] hasKey){
        for(int i:room){
            hasKey[i] = true;
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms){

        int keys [] = new int[rooms.size()];
        boolean hasKeys [] = new boolean[rooms.size()];
        hasKeys[0] = true;
        int TrueNum = 1;

        while(true){
            int CurTrueNum = 0;

            for(int i=0;i<hasKeys.length;i++){
                if(hasKeys[i])visit(rooms.get(i),hasKeys);
            }
            for(boolean i:hasKeys){
                if(i)CurTrueNum++;
            }

            if(CurTrueNum==rooms.size())return true;
            else if(CurTrueNum>TrueNum)TrueNum = CurTrueNum;
            else{
                if(CurTrueNum==TrueNum)return false;
            }
        }
    }
}
