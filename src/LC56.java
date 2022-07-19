import java.util.*;

/**
 * @author Nwy-java
 */
public class LC56 {
    public static int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length <= 1)
            return intervals;
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (x,y) -> x[0] - y[0]);
        int i = 0, n = intervals.length;
        while(i < n){
            int l = intervals[i][0];
            int r = intervals[i][1];
            while(i < n - 1 && r >= intervals[i + 1][0]){
                r = Math.max(r, intervals[i + 1][1]);
                i++;
            }
            int[] a = {l,r};
            list.add(a);
            i++;
        }
        return list.toArray(new int[list.size()][2]);
    }

    public static void main(String[] args) {
        int[][] nums = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merge = merge(nums);
        for (int[] ints : merge) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
