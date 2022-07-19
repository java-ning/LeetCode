/**
 * @author Nwy-java
 */
public class LC844 {
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int size = 0,size1 = 0;
        if(s.charAt(0)!= '#') {
            sb1.append(s.charAt(0));
            size++;
        }
        if(t.charAt(0)!='#'){
            sb2.append(t.charAt(0));
            size1++;
        }
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == '#' && size>0){
                sb1.delete(size-1,size);
                size--;
            }
            if(s.charAt(i) != '#' && size1>0){
                sb1.append(s.charAt(i));
                size++;
            }
        }
        for(int i = 1;i<t.length();i++){
            if(t.charAt(i) == '#'){
                sb2.delete(size1-1,size1);
                size1--;
            }
            if(t.charAt(i) != '#'){
                sb2.append(t.charAt(i));
                size1++;
            }
        }
        return sb1.toString().equals(sb2.toString());
    }
    public static void main(String[] args) {
        String s = "ab##";
        String s1 = "c#d#";
        boolean b = backspaceCompare(s, s1);
        System.out.println(b);
    }
}
