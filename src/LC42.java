/**
 * @author Nwy-java
 */
public class LC42 {
    public static int trap(int[] height) {
        int ans = 0;
        int n = height.length;
        for(int i = 1;i<n-1;i++){
            int leftMax = 0;
            int rightMax = 0;
            for(int j = i;j>=0;j--){
                leftMax = Math.max(leftMax,height[j]);
            }
            for(int j = i;j<n;j++){
                rightMax = Math.max(rightMax,height[j]);
            }
            ans += Math.min(leftMax,rightMax) - height[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trap = trap(height);
        System.out.println(trap);
    }
}
