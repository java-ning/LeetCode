/**
 * @author Nwy-java
 */
public class LC557 {
    public static String reverseWords(String s) {
        StringBuffer ret = new StringBuffer();
        int length = s.length();
        int i = 0;
        //计算总长度。
        while (i < length) {
//            start用来分割每一个内容
            int start = i;
//            当不等于空格的时候，我们就i++,直到找到空格为止，start到i之间的值就是我们的
//            这个要翻转的单词。
            while (i < length && s.charAt(i) != ' ') {
                i++;
            }

            //利用append和s.charaT翻转，牛批，start+i-1-p，牛批
            for (int p = start; p < i; p++) {
                ret.append(s.charAt(start + i - 1 - p));
            }
            while (i < length && s.charAt(i) == ' ') {
                i++;
                ret.append(' ');
            }
        }
        return ret.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String s1 = reverseWords(s);
        System.out.println(s1);
    }

}
