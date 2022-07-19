/**
 * @author Nwy-java
 */
public class LC733 {
    int dfs(int[][] image,int sr,int sc,int newColor,int same){
        int same1 = same;
        if(sr<image.length && sr>=0 && sc<image[0].length && sc>=0){
            if(image[sr][sc] != newColor && image[sr][sc] == same){
                image[sr][sc] = newColor;
                dfs(image,sr+1,sc,newColor,same1);
                dfs(image,sr,sc+1,newColor,same1);
                dfs(image,sr-1,sc,newColor,same1);
                dfs(image,sr,sc-1,newColor,same1);
                return 1;
            }
        }
        return 0;
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int same = image[sr][sc];
        dfs(image,sr,sc,newColor,same);
        return image;
    }

    public static void main(String[] args) {
        ThreadLocal<Integer> tThreadLocal = new ThreadLocal<Integer>();
    }
}
