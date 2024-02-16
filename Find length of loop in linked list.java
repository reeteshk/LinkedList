/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static int lengthOfLoop(Node head) {
        // Write your code here

        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
            {
                break;
            }
        }
        if(fast == null || fast.next == null)
        {
            return 0;
        }
        Node dummy = slow.next;
        int len =0;
        while(dummy!=slow)
        {
            dummy = dummy.next;
            len++;
        }
        return len+1;

    }
}