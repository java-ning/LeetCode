/**
 * @author Nwy-java
 */
public class SO63 {
    public static int maxProfit(int[] prices) {
        int max = 0;
        int left = 0,right = 1;
        for(int i = 0;i<prices.length;i++){
            if(prices[right] - prices[left] > 0) {
                max = Math.max(max,prices[right] - prices[left]);
                if(right < prices.length - 1) right++;
            }
            else{
                left = right;
                if(right < prices.length - 1) right++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {7,6,4,3,1};
        int i = maxProfit(nums);
        System.out.println(i);
    }
}
