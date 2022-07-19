import java.util.*;

/**
 * @author Nwy-java
 */
public class LC438 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        int length1 = p.length();
        for(int i = 0;i<p.length();i++){
            a1[p.charAt(i) - 'a']++;
            a2[s.charAt(i) - 'a']++;
        }

        for(int i = p.length();i <= s.length();i++){
            if(isSame(a1,a2,length1)){
                list.add(i - p.length());
            }
            if(i<s.length()) {
                a2[s.charAt(i - p.length()) - 'a']--;
                a2[s.charAt(i) - 'a']++;
            }
        }
        return list;
    }
    static boolean isSame(int[] a1,int[] a2,int length1){
        int length = 0;
        for(int i = 0;i<a1.length;i++){
            if(a1[i] != 0 && a2[i] != 0 && a1[i] == a2[i]){
                length += a1[i];
            }
        }
        if(length == length1) return true;
        else return false;
    }

    public static void main(String[] args) {
        String s = "aaaaaaaaaa",p = "aaaaaaaaaaaaa";
        List<Integer> anagrams = findAnagrams(s, p);
        for (Integer anagram : anagrams) {
            System.out.println(anagram);
        }
    }
}
