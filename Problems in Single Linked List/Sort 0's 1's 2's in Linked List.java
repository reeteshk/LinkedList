public class Solution
{
    public static Node sortList(Node head) {
        // Write your code here

        Node zeroHead = new Node(-1);
        Node zeroTail = zeroHead;
        Node oneHead = new Node(-1);
        Node oneTail = oneHead;
        Node twoHead = new Node(-1);
        Node twoTail = twoHead;

        Node temp = head;
        while(temp != null)
        {
            if(temp.data == 0)
            {
                zeroTail.next = temp;
                zeroTail = zeroTail.next;
            }
            else if(temp.data == 1)
            {
                oneTail.next = temp;
                oneTail = oneTail.next;
            }
            else
            {
                twoTail.next = temp;
                twoTail = twoTail.next;
            }
            temp = temp.next;
        }
        zeroTail.next = oneHead.next;
        oneTail.next = twoHead.next;
        twoTail.next = null;
        return zeroHead.next;

    }
}