import java.util.HashMap;
import java.util.Map;

/**
 * @author Nwy-java
 */
public class LC1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(nums[i])};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
