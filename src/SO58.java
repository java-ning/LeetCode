/**
 * @author Nwy-java
 */
public class SO58 {
    public static String reverseWords(String s) {
        String s1 = s.trim();
        StringBuilder sb = new StringBuilder();
        int i = s1.length()-1,j=s1.length();
        while(i>=0){
            while(i>=0 && s1.charAt(i) != ' ') {
                i--;
            }
            i=i;
            sb.append(s1.substring(i+1,j));
            while(i>=0 && s1.charAt(i) == ' '){
                i--;
            }
            j = i+1;
            if(i>=0) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String a = "the sky is blue";
        String s = reverseWords(a);
        System.out.println(s);
    }
}
