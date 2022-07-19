import java.util.HashMap;

/**
 * @author Nwy-java
 */
public class LC409 {
    public static int longestPalindrome(String s) {
        //记录最大长度
        int ans = 0;
        //用HashMap,记录元素以及出现次数,并且设置HashMap长度为128。
        HashMap<Integer, Integer> map = new HashMap<>();
        //循环将字符放入到HashMap中,并用value计算出现次数。
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z') {
                map.put(c - 'a',map.getOrDefault(c-'a',0)+1);
            }
            else {
                map.put(c - 'A'+26,map.getOrDefault(c-'A'+26,0)+1);
            }
        }
        //设置一个中间位。
        int middle = 0;
        //如果是奇数，就判断是不是大于1的奇数，如果是就-1再放入,并且中间位变成1
        //如果就是1,依旧把中间为变成1。
        for (Integer key : map.keySet()) {
            //如果是偶数，就都加上。
            if(map.get(key)%2 == 0){
                ans += map.get(key);
            }
            else if(map.get(key) % 2!=0){
                ans += map.get(key) -1;
                middle = 1;
            }
        }

        return ans + middle;
    }
    public static void main(String[] args) {
        String s = "aaaAaaaa";
        int i = longestPalindrome(s);
        System.out.println(i);
    }
}
