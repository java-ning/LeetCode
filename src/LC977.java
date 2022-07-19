import java.util.Arrays;

/**
 * @author Nwy-java
 */
public class LC977 {

    public int[] sortedSquares(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            nums[i] = (int)Math.pow(nums[i],2);
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {

    }
}
