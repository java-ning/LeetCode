import java.util.HashSet;

/**
 * @author Nwy-java
 */
public class LC1346 {
    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set =new HashSet<Integer>();
        for(int i:arr){
            if(set.contains(i))return true;
            set.add(i*2);
            if(i%2==0)set.add(i/2);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,2,5,3};
        boolean b = checkIfExist(arr);
        System.out.println(b);
    }
}
