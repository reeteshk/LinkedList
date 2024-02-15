
class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // add your code here
        
        if(head == null || head.next == null )
        {
            return head;
        }
        Node mid = FindMid(head);
        Node head2 = mid.next;
        mid.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(head2);
        
        Node ans = merge(left,right);
        return ans;
    }
    
    public static Node FindMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        
        while(fast!= null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static Node merge(Node head1,Node head2)
    {
        Node head = new Node(-1);
        Node tail = head;
        
        while(head1 !=null && head2 !=null)
        {
            if(head.data== -1)
            {
                if(head1.data>head2.data)
                {
                    head = head2;
                    tail = head2;
                    head2 = head2.next;
                }
                else
                {
                    head = head1;
                    tail = head1;
                    head1 = head1.next;
                }
            }
            else
            {
                if(head1.data>head2.data)
                {
                    tail.next = head2;
                    tail = tail.next;
                    head2 = head2.next;
                }
                else
                {
                    tail.next = head1;
                    tail = tail.next;
                    head1 = head1.next;
                }
                
            }
        }
        
        if(head1!=null)
        {
            tail.next = head1;
        }
        if(head2!=null)
        {
            tail.next = head2;
        }
        return head;
    }
    
}


