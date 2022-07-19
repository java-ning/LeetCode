import java.util.Arrays;

/**
 * @author Nwy-java
 */
public class LC283 {
    public static void moveZeroes(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,0,3,0};
        moveZeroes(nums);
    }
}
