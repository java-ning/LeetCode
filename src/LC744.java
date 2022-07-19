/**
 * @author Nwy-java
 */
public class LC744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        if(target >= letters[letters.length-1]) return letters[0];
        int left = 0,right = letters.length - 1;
        int ans = 0;
        while(left<right){
            int mid = left+ (right -left)/2;
            if(letters[mid] > target){
                right = mid;
            }
            else left = mid+1;
        }
        return letters[left];
    }

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'd';
        char c = nextGreatestLetter(letters, target);
        System.out.println(c);
    }
}
