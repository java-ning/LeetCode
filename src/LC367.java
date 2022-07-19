/**
 * @author Nwy-java
 */
public class LC367 {

    public static boolean isPerfectSquare(int num) {
        int left = 0,right = num;
        while(left<=right){
            int mid = left + (right - left)/2;
            if((mid * mid) == num) return true;
            else if((mid * mid) < num) left = mid + 1;
            else right = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
