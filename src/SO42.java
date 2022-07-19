/**
 * @author Nwy-java
 */
public class SO42 {

    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i = 0; i<nums.length - 1; i++){
            if(nums[i] > 0){
                nums[i+1] = nums[i] + nums[i+1];
            }
          res = Math.max(res,nums[i+1]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray(nums);
        System.out.println(i);
    }
}
