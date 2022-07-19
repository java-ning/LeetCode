import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Nwy-java
 */
public class HJ8 {
    public static void main(String[] args) throws Exception{
        HashMap<Integer,Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i = 0;i < num;i++){
            int key = in.nextInt();
            int value = in.nextInt();
            if(map.containsKey(key)){
                int value1 = map.get(key);
                value1 += value;
                map.put(key,value1);
            }
            map.put(key,value);
        }

        
    }
}
