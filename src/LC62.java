/**
 * @author Nwy-java
 */
public class LC62 {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        //dp[i][j] = dp[i-1][j] + dp[i][j-1];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(i == 0){
                    dp[i][j] = 1;
                }
                if(j == 0){
                    dp[i][j] = 1;
                }
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int m = 3,n=7;
        int i = uniquePaths(m, n);
        System.out.println(i);
    }
}
