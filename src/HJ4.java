import java.io.IOException;
import java.util.Scanner;

/**
 * @author Nwy-java
 */
public class HJ4 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        while(s.length()>=8){
            System.out.println(s.substring(0,8));
            s=s.substring(8);
        }
        if(s.length()>=0 && s.length()<8){
            s+="00000000";
            System.out.println(s.substring(0,8));
        }
    }
}
