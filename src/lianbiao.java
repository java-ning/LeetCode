import java.awt.*;

/**
 * @author Nwy-java
 * 将给定的单链表： L0 L1 L2 L3 L4
 * 重新排序为：L0 L4 L1 L3 L2
 * 要求使用原地算法，不能只改变节点内部的值，需要对实际的节点进行交换。
 *
 * 数据范围：链表长度  ，链表中每个节点的值满足
 *
 * 要求：空间复杂度 O(n)并在链表上进行操作而不新建链表，时间复杂度O(n)
 * 进阶：空间复杂度 O(1)， 时间复杂度O(n)
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}


public class lianbiao {
    /**
     * 思路：先将链表从中间一分为二
     * 然后翻转后半部分链表
     * 最后合并两者
     */
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode mid = middleNode(head);
        ListNode l1 = head;
        ListNode l2 = mid.next;
        mid.next = null;
        l2 = reverseList(l2);
        mergeList(l1, l2);
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public void mergeList(ListNode l1, ListNode l2) {
        ListNode l1_tmp;
        ListNode l2_tmp;
            while (l1 != null && l2 != null) {
                l1_tmp = l1.next;
                l2_tmp = l2.next;

                l1.next = l2;
                l1 = l1_tmp;

                l2.next = l1;
                l2 = l2_tmp;
        }
    }
}
