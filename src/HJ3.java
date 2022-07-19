import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author Nwy-java
 */
public class HJ3 {
    public static void main(String[] args) throws IOException {
//        TreeSet set = new TreeSet();
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        for(int i = 0; i<num ;i++){
//            set.add(in.nextInt());
//        }
//        Iterator iterator = set.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


        String s2 = "as-dv-ca";
        String[] split = s2.split("-");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
