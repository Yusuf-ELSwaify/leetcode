
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        curr.next = head;

        while (curr.next != null && curr.next.next != null) {
            ListNode first = curr.next;
            ListNode second = curr.next.next;

            curr.next = second;
            first.next = second.next;
            second.next = first;
            curr = curr.next.next;
        }  
        return ans.next;      
    }
}