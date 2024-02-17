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
    public boolean isPalindrome(ListNode head) {
        
        ListNode dummy = head;
        ListNode temp = reverse(dummy);

        while(head!=null)
        {
            if(head.val != temp.val)
            {
                return false;
            }
            head = head.next;
            temp = temp.next;
        }
        return true;
    }
    //here we can't use the normal reverse function because it usually do changes in the same node istead of that we should have a listnode reveresed with changed Nodes
    public static ListNode reverse(ListNode head)
    {
         if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode newHead = null;

        while (current != null) {
            ListNode newNode = new ListNode(current.val);
            newNode.next = newHead;
            newHead = newNode;
            current = current.next;
        }

        return newHead;
    }
}