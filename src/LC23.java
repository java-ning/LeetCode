import java.util.*;
import java.util.ArrayList;

/**
 * @author Nwy-java
 */

public class LC23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode(0);
        List<Integer> list = new ArrayList<>();
        for(ListNode list1 : lists){
            while(list1 != null){
                list.add(list1.val);
                list1 = list1.next;
            }
        }
        int[] num = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            num[i] = list.get(i);
        }
        Arrays.sort(num);

        for(Integer nums: num){
            ListNode temp = new ListNode(nums);
            result.next = temp;
        }
        return null;
    }
    public static void main(String[] args) {

    }
}
