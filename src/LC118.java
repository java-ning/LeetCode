import java.util.*;

/**
 * @author Nwy-java
 */
public class LC118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int a = 1;
        for(int i = 0;i < numRows;i++){
            for (int j = 0; j < i+1; j++) {
                list.get(i).add(a);
            }
        }
        for (List<Integer> integers : list) {
            System.out.println(integers.toString());
        }
        return list;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> generate = generate(numRows);
//        System.out.println(generate);
    }
}
