package xyz.optimized.recursivefun.algos.medium;
/*
LeetCode Problem 2
https://leetcode.com/problems/add-two-numbers/description/
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        int num = l1.val + l2.val + carry;
        carry = num / 10;
        ListNode result = new ListNode(num % 10);
        if (l1.next != null && l2.next != null) {
            result.next = addTwoNumbers(l1.next, l2.next, carry);
        }
        if (l1.next != null && l2.next == null) {
            result.next = addTwoNumbers(l1.next, new ListNode(0), carry);
        }
        if (l2.next != null && l1.next == null) {
            result.next = addTwoNumbers(new ListNode(0), l2.next, carry);
        }
        if (l1.next == null && l2.next == null) {
            if (carry == 1) result.next = new ListNode(1);
        }
        return result;
    }
}
