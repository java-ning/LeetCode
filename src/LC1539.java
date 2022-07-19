/**
 * @author Nwy-java
 */
public class LC1539 {
    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            //2 3 4 7 11
            if (arr[i] - i - 1 >= k) {
                return k + i;
            }
        }
        return k + n;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        int kthPositive = findKthPositive(arr, k);
        System.out.println(kthPositive);
    }
}
