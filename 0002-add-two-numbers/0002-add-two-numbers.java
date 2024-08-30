/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode curr = node;

        int carry = 0;
        int d = 0;
        while (l1 != null || l2 != null) {
            int data1 = 0;
            int data2 = 0;
            if (l1 != null) {
                data1 = l1.val;
            }
            if (l2 != null) {
                data2 = l2.val;
            }
            d = (data1 + data2 + carry) % 10;

            ListNode temp = new ListNode(d);
            curr.next = temp;
            curr = curr.next;
            carry = (data1 + data2 + carry) / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            ListNode temp = new ListNode(carry);
            curr.next = temp;
        }

        return node.next;
    }
}