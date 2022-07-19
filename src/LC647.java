/**
 * @author Nwy-java
 */
public class LC647 {
    static int num = 0;
    public static int countSubstrings(String s) {
        for (int i=0; i < s.length(); i++){
            count(s, i, i);//回文串长度为奇数
            count(s, i, i+1);//回文串长度为偶数
        }
        return num;
    }

    public static void count(String s, int start, int end){
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            num++;
            start--;
            end++;
        }
    }

    public static void main(String[] args) {
        String s = "aaaa";
        int i = countSubstrings(s);
        System.out.println(i);
    }
}
