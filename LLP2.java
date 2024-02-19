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
public class LLP2{
    

    public static void main(String[] args) {

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

        Node newH = removeHead(head);
        Print(newH);
        Node newH1 = removeTail(newH);
        Print(newH1);
    


    }

    public static void Print(Node head) {
         
        while (head!=null) {
            System.out.print(head.data+" ");
            head =  head.next;   
        }
        System.out.println();

    }
    public static Node removeHead(Node head)
    {
        if(head == null)
        {
            return null;
        }
        return head.next;
    }

    public static Node removeTail(Node head)
    {
        Node dummy2 = head;
        if(head == null || head.next ==  null)
        {
            return null;
        }
        while(head.next.next != null)
        {
            head = head.next;
        }
        head.next = null;
        return dummy2;
    }
}
