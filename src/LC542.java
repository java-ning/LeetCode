/**
 * @author Nwy-java
 */
public class LC542 {
    int dfs(int[][] mat,int i,int j){
        if(i<mat.length && i>=0 && j<mat[0].length && j>=0){
            if(mat[i][j] == 0){
                return 1;
            }
            if(mat[i][j] == 1){
                return 1 + dfs(mat,i+1,j) + dfs(mat,i,j+1) + dfs(mat,i-1,j) +dfs(mat,i,j-1);
            }
        }
        return 0;
    }

    public int[][] updateMatrix(int[][] mat) {
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                dfs(mat,i,j);
            }
        }
        return mat;
    }
}
