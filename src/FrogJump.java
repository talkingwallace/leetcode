import java.util.HashMap;
import java.math.*;

public class FrogJump {

    public static HashMap<Integer,Integer> store = new HashMap<Integer, Integer>();

    static public int JumpFloor(int target) {
        if(target == 0)return 0;
        if(target == 1)return 1;
        if(target == 2)return 2;
        else{
            if(store.containsKey(target))return store.get(target);
            else{
                int result = JumpFloor(target-1) + JumpFloor(target-2);
                store.put(target,result);
                return result;
            }
        }
    }

}
