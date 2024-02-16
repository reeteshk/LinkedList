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

public class Solution {
    public static Node rotate(Node head, int k) {
        // Write your code here.
     if (head == null || k == 0) {
            return head;
        }

        // Calculate the length of the linked list
        int length = 1; // Start from 1 because head is not null
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        // Adjust rotation amount
         k = k % length;
        if (k == 0) {
            return head;
        }

        // Find the (length - k)th node from the beginning
        int t = length - k;
        temp = head;
        for (int i = 1; i < t; i++) {
            temp = temp.next;
        }

        // Rotate the list
        Node newHead = temp.next;
        temp.next = null;
        
        // Traverse to the end of the rotated list
        temp = newHead;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Connect the end to the original head
        temp.next = head;

        return newHead;

    }
}