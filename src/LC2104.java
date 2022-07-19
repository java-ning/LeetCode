/**
 * @author Nwy-java
 */
public class LC2104 {
    public static long subArrayRanges(int[] nums) {
        int n = nums.length,ret = 0;
        for(int i = 0 ;i<n;i++){
            int maxLen = Integer.MIN_VALUE,minLen = Integer.MAX_VALUE;

            for(int j = i;j<n;j++){
                maxLen = Math.max(maxLen,nums[j]);
                minLen = Math.min(minLen,nums[j]);
                ret+= maxLen - minLen;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] sum ={4,-2,-3,4,1};
        int[] sum1 ={1,2,3};
        long l = subArrayRanges(sum);
        System.out.println(l);
    }
}
