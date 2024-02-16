public class Solution {
    public boolean hasCycle(ListNode head) {
        
      //  return UsingHashSet(head);
       return UsingFastSlowPointer(head);
    }
    public static boolean UsingHashSet(ListNode head)
    {
        HashSet<ListNode> hs=new HashSet<>();
        while(head!=null)
        {
            if(hs.contains(head)==true)
            {
                return true;
            }
            hs.add(head);
            head=head.next;
        }
        return false;
    }
    public static boolean UsingFastSlowPointer(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
}