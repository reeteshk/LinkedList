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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
       // return  BruteForce(head,n);
        return optimizedSlowAndFast(head,n);
    }

    public static ListNode BruteForce(ListNode head,int n)
    {
        int len = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            temp = temp.next; 
            len++;
        }
        int t = len - n;
        if(t == 0)
        {
            return head.next;
        }
        temp = head;
        int i=0;
        // Traverse to the node just before the one to be removed
            while (i < t - 1 && temp != null) {
                temp = temp.next;
                i++;
            }

        if(temp== null || temp.next == null  )
        {
            return head;
        }
        temp.next= temp.next.next;
        return head;
    }
    public static ListNode optimizedSlowAndFast(ListNode head,int n)
    {
        ListNode slow=head;
        ListNode fast=head;

        for(int i=0;i<n;i++)
        {
            fast = fast.next;
        }
        if (fast == null)
            return head.next;

        while(fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head; 
    }
}