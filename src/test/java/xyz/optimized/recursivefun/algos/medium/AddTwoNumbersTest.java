package xyz.optimized.recursivefun.algos.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Class to test the addTwoNumbers method in AddTwoNumbers class.
 */
public class AddTwoNumbersTest {
  
    @Test
    void addTwoNumbers_with_no_carry_forward() {
        // Arrange
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode l1 = new ListNode(2, node3);

        ListNode node4b = new ListNode(4);
        ListNode node6 = new ListNode(6, node4b);
        ListNode l2 = new ListNode(5, node6);

        // Act
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        // Assert
        Assertions.assertEquals(7, result.val);
        Assertions.assertEquals(9, result.next.val);
        Assertions.assertEquals(8, result.next.next.val);
        Assertions.assertNull(result.next.next.next);
    }

    @Test
    void addTwoNumbers_with_carry_forward_on_second_digit() {
        // Arrange
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode node4 = new ListNode(4);
        ListNode node4a = new ListNode(4, node4);
        ListNode l1 = new ListNode(2, node4a);

        ListNode node4b = new ListNode(4);
        ListNode node6 = new ListNode(6, node4b);
        ListNode l2 = new ListNode(5, node6);

        // Act
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        // Assert
        Assertions.assertEquals(7, result.val);
        Assertions.assertEquals(0, result.next.val);
        Assertions.assertEquals(9, result.next.next.val);
        Assertions.assertNull(result.next.next.next);
    }

    @Test
    void addTwoNumbers_with_carry_forward_on_third_digit() {
        // Arrange
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode node5 = new ListNode(5);
        ListNode node4a = new ListNode(4, node5);
        ListNode l1 = new ListNode(2, node4a);

        ListNode node4b = new ListNode(4);
        ListNode node6 = new ListNode(6, node4b);
        ListNode l2 = new ListNode(5, node6);

        // Act
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        // Assert
        Assertions.assertEquals(7, result.val);
        Assertions.assertEquals(0, result.next.val);
        Assertions.assertEquals(0, result.next.next.val);
        Assertions.assertEquals(1, result.next.next.next.val);
        Assertions.assertNull(result.next.next.next.next);
    }
}