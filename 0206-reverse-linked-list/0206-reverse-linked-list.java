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
    public ListNode reverseList(ListNode head) {
        ListNode current = head, previous = null, curNext;
        
        if(head==null)
            return head;
    	while(current.next!=null)
    	{
    		curNext = current.next;
    		current.next = previous;
    		previous = current;
    		current = curNext;
    	}
        current.next = previous;
    	return current; 
    }
}