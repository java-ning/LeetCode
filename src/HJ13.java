import java.io.IOException;
import java.util.Scanner;

/**
 * @author Nwy-java
 */
public class HJ13 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int i = s.length() - 1,j = s.length();
        //存储我们最终的结果。
        StringBuilder sb = new StringBuilder();
        while(i>=0){

            //从后往前排查，如果不等于空格就i--，等于空格就把空格后的加进去。
            while(i>0 && s.charAt(i) != ' '){
                i--;
            }
            //将空格后的内容放到我们的append中
            if(s.charAt(i) == ' ' || i == 0){
                if(i!=0) {
                    sb.append(s.substring(i + 1, j)).append(" ");
                }
                if(i == 0){
                    sb.append(s.substring(i,j));
                }
            }
            j = i;
            i--;
        }
        System.out.print(sb.toString());
    }
}
