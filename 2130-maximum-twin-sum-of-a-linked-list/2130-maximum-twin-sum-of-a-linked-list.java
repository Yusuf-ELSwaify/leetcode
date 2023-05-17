/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode tortoise = head, hare = head, prevPtr = null;
        int max = 0;

        while (hare != null && hare.next != null) {
            ListNode nextNode = tortoise.next;

            hare = hare.next.next;
            tortoise.next = prevPtr;
            prevPtr = tortoise;
            tortoise = nextNode;
        }

        while (tortoise != null) {
            max = Math.max(max, tortoise.val + prevPtr.val);
            tortoise = tortoise.next;
            prevPtr = prevPtr.next;
        }
        return max;
    }
}