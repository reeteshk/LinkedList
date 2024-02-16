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
    public ListNode reverseKGroup(ListNode head, int k) {
        

        ListNode temp = head;

        int count = 0;
        while(temp!=null && count<k)
        {
            temp = temp.next;
            count++;
        }
        if(count<k)
        {
            return head;
        }

        ListNode reverseHead = reverse(head,k);
        head.next = reverseKGroup(temp,k);
        return reverseHead;


    }
    public static ListNode reverse(ListNode head,int k)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(k> 0 && curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            k--;
        }
        return prev;
    }
}