/**
 * @author Nwy-java
 */
public class LC121 {
    public static int maxProfit(int[] prices) {
        int min = prices[0],maxNum = 0;
        for(int i = 0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            maxNum = Math.max(maxNum,prices[i] - min);
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int i = maxProfit(prices);
        System.out.println(i);
    }
}
