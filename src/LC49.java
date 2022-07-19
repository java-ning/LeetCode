import java.util.*;

/**
 * @author Nwy-java
 */
public class LC49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        //创建一个标识符key和一个存储和key相同构造的List
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        //遍历strs
        for (String str : strs) {
            //每个str转换成字符数组
            char[] array = str.toCharArray();
            //对字符数组进行排序
            Arrays.sort(array);
            //转化为字符串key
            String key = new String(array);
            //判断是否有这个标识符的ArrayList,如果有就获取，如果没有就创建一个。
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            //加入筋这个列表
            list.add(str);
            //如果没有就进行存储，如果有就覆盖。
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(str);
//        for (List<String> list : lists) {
//            System.out.println(list);
//        }
    }
}
