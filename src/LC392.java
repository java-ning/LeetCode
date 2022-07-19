/**
 * @author Nwy-java
 */
public class LC392 {
    public static boolean isSubsequence(String s, String t) {
        int s1 = 0,t1 = 0;
        int i = 0;
        int length = t.length();
        while(t1<length){

            if(s.charAt(s1) == t.charAt(t1)){
                i++;
                s1++;
                t1++;
            }
            else{
                t1++;
            }
            if(i == s.length()){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "aec", t = "ahbgdc";
        boolean subsequence = isSubsequence(s, t);
        System.out.println(subsequence);

    }
}
