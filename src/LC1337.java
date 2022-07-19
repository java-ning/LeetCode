import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Nwy-java
 */
public class LC1337 {
    public static int[] kWeakestRows(int[][] mat, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {
            int k1 = 0;
            for (int j = mat[0].length - 1; j >= 0; j--) {
                if (mat[i][j] == 1) {
                    k1++;
                }
            }
            list.add(k1);
        }
        int[] res = new int[list.size()];
        int[] res1 = new int[k];
        System.out.println(list);
        int max = 0;
        for(int i = 0;i<list.size();i++){
            res[i] = list.get(i);
            max = Math.max(max,res[i]);
        }
        System.out.println(Arrays.toString(res));
        int min = 0;
        for(int i =0;i<k;i++){
            for (int j = 0; j < res.length - 1; j++) {
               if(res[min] > res[j+1]){
                   min = j+1;
               }
            }
            res[min] = max+1;
            res1[i] = min;
            min = 0;
        }
        System.out.println(Arrays.toString(res1));
        return res1;
    }

    public static void main(String[] args) {
        int k = 4;
        int[][] mat = new int[][]{{1, 0}, {1, 0}, {1, 0}, {1, 1}};
        int[] ints = kWeakestRows(mat, k);
        System.out.println(Arrays.toString(ints));
    }
}
