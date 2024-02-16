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
    public ListNode oddEvenList(ListNode head) {
        

        if(head == null || head.next == null || head.next.next == null)
        {
            return head;
        }
        ListNode oddHead =  new ListNode(-1);
        ListNode oddTail =  oddHead;
        ListNode evenHead = new ListNode(-1);
        ListNode evenTail = evenHead;

        int count = 1;

        ListNode temp = head;

        while(temp!= null)
        {
            if(count%2 == 1)
            {
                oddTail.next = temp;
                temp = temp.next;
                oddTail = oddTail.next;
            }
            else
            {
               evenTail.next = temp;
                temp = temp.next;
                evenTail = evenTail.next;

            }
            count++;
        }

        oddTail.next = evenHead.next;
        evenTail.next = null;
        return oddHead.next;

    }
}