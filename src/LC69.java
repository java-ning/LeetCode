/**
 * @author Nwy-java
 */
public class LC69 {
    public static int mySqrt(int x) {
        int left = 0,right = x,ans = 0;
        while(left<right){
            int mid = left + (right-left)/2;
            long result = (long)mid * mid;
            if(result > x) right = mid - 1;
            else if(result <= x) {
                ans = mid;
                left = mid + 1;
            }
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        int x = 8;
        mySqrt(x);
    }
}
