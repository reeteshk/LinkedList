/****************************************************************

 Following is the class structure of the Node class:

class Node {
     public int data;
     public Node next;
     public Node child;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.child = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.child = null;
     }
     Node(int data, Node next, Node child)
     {
         this.data = data;
         this.next = next;
         this.child = child;
     }
 }

 *****************************************************************/

/*
    Time Complexity: O((N * K) * (log(N * K)))
    Space complexity: O(N * K)

    Where 'N' denotes the size of the linked list and 'K' is the average number of child nodes for each of the N nodes.
*/

import java.util.*;

public class Solution {
    public static Node flattenLinkedList(Node head) {
        //Write your code here

        Node temp = head;
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->(a.data - b.data));

        while(temp!=null)
        {
            pq.add(temp);
            temp = temp.next;
        }

        Node dummy = new Node(-1);
        Node test = dummy;
        while(!pq.isEmpty())
        {
            Node n = pq.remove();
            dummy.child = n;
            dummy = dummy.next;
            n = n.child;
            if(n!=null)
            {
                pq.add(n);
            }
        }
        return test.next;
    }
}