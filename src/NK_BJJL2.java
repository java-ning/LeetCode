import java.util.Scanner;

/**
 * @author Nwy-java
 */
public class NK_BJJL2 {
    public static int minEditCost (String str1, String str2, int ic, int dc, int rc) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        // write code here
        int str1Length = str1.length();
        int str2Length = str2.length();
        int result = 0;
        int temp = 0;
        if(str1Length == str2Length){
            for(int i = 0;i<str1Length;i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    result+=rc;
                }
            }
        }
        else if(str1Length > str2Length){
            for(int i = 0;i<str1Length;i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    temp++;
                }
                if (temp == str2Length) {
                    result += dc * (str1Length - str2Length) + str2Length - temp;
                }
                else {
                    result += dc * (str1Length - str2Length) + ic * (str2Length - temp);
                }
            }
        }
        else if(str1Length < str2Length){
            for(int i = 0;i<str1Length;i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    temp++;
                }
                result += (str2Length - temp) * ic;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "adc";
        int i = minEditCost(s1, s2, 5, 3, 100);
        System.out.println(i);
    }
}
