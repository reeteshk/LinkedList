public class DLL {

    public static Node convertArr2DLL(int arr[])
    {
        Node head =  new Node(arr[0]);
        Node prev = head;
        for(int i = 1;i < arr.length ; i++)
        {
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static Node deleteHead(Node head)
    {
        if(head ==  null || head.next ==  null)
        {
            return null;
        }
        Node prev = head;
        head =  head.next;
        head.back = null;
        prev.next = null;
        return head;
        
    }
    public static Node deleteTail(Node head)
    {
        if(head == null || head.next ==  null)
        {
            return null;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        Node k = temp.back;
        temp.back = null;
        k.next = null;
        return head;
    }

    public static Node DeleteKNode(Node head,int k)
    {


        if(k == 1)
        {
            Node temp = head;
            head = head.next;
            temp.next  = null;
            head.back = null;
            return head;
        }
        int t = 0;
        Node dummy = head;
        while(head!= null || t!=k)
        {
            head =  head.next;
        }
        Node temp = head.back;
        if(head.next != null)
        {
            temp.next = head.next;
            head.back = temp;
            head.next = null;
            head.back = null;
        }
        return dummy;

    }
    public static void print(Node head)
    {
        while(head!= null)
        {
            System.out.print(head.data+" ");
            head  = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};
        Node head = convertArr2DLL(arr);
        print(head);
        Node temp = deleteHead(head);
        print(temp);
        Node temp2 = deleteTail(temp);
        print(temp2);
        Node temp3 = DeleteKNode(temp,3);
        print(temp3);

    }
    
}

class Node{
    int data;
    Node next;
    Node back;
    public Node(int data,Node next,Node back)
    {
        this.next = next;
        this.data = data;
        this.back = back;

    }
    public Node (int data)
    {
        this.data = data;
        this.next = null;
        this.back =  null;
    }
}