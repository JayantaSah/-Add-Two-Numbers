
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        // Traverse both lists
        while (l1 != null || l2 != null) {
            // Get the values of the current nodes or 0 if the node is null
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;

            // Update carry for next iteration
            carry = sum / 10;

            // Create the new node for the current digit and move the pointer
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to the next nodes in both lists, if available
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there's still a carry left, add a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Return the result list, which starts from dummy.next
        return dummy.next;        
    }
}S
