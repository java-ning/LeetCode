/**
 * @author Nwy-java
 */
public class LC424 {

    public int characterReplacement(String s, int k) {
        //窗口的两边指针
        int left =0,right = 0;
        int result = 0;
        //保存当前窗口范围内最多的字符的长度
        //比方说当前窗口内有3个A,1个B,他就保存当前窗口内最多的那个3。
        int maxlen = -1;
        //创建一个数组，保存每一个字符，在窗口范围内，有多少个数量。maxlen记得是当前数组中最长的那一个。
        char[] charNums = new char[256];
        //开始，右边界要不停的移动。

        while(right<s.length()){
            //每走一步，我都把当前字符取出来，然后加在charNums里面。
            char cur = s.charAt(right);
            //比如说走到A了，让A这个位置的数量++
            charNums[cur]++;
            maxlen = Math.max(maxlen,charNums[cur]);
            //right - left + 1是我们窗口的长度，再减掉我们当前窗口内最长的那个，是否大于k
            //如果比k大，说明k没办法把它填完，这种情况下我们左边就要走，让left++。
            while((right - left + 1 -maxlen)>k)
                //左边走的情况下呢，我们要让被丢弃的那个字符长度减一。
                charNums[s.charAt(left++)]--;
                //之前和现在的最大长度做一个比较。更新一下
                result= Math.max(result,right-left+1);
                //右移动。
                right++;
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
