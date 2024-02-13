class Node{
    int data;
    Node next;
    public Node(Node next,int data)
    {
        this.next = next;
        this.data = data;
    }
    public Node (int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class Main{
    public static void main(String[] args)
    {
        
        int arr []= new int[]{1,2,3,4,5};
        
        Node head = null;
        Node tail = null;
        
        for(int i = 0 ; i < arr.length; i++)
        {
            if(tail == null)
            {
                Node node = new Node(arr[i]);
                head = node;
                tail = node;
            }
            else
            {
                tail.next = new Node(arr[i]);
                tail  = tail.next;
            }
        }

        Node newH = head;
        int count = 0;
        while(head!=null)
        {
            count++;
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
        System.out.println(count);
        
        System.out.println(search(newH, 19));
            
    }

    public static int search(Node root,int key)
    {
        Node temp  = root;
        while(temp != null)
        {
            if(temp.data == key)
            {
                return temp.data;
            }
            temp = temp.next;
        }
        return -1;
    }
        
}