/**
 * @author Nwy-java
 */
public class LC1351 {
    public static int countNegatives(int[][] grid) {
        int num = 0;
        int left = 0,right = grid[0].length - 1;
        while(left<grid.length && right>=0){
            if(grid[left][right] < 0){
                num += grid.length - left;
                //向左移动
                right --;
            }
            else {
                //向下移动
                left++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{4,3,2,1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int i = countNegatives(nums);
        System.out.println(i);
    }
}


