public class DLL {

    public static Node convertArr2DLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;

    }

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node k = temp.back;
        temp.back = null;
        k.next = null;
        return head;
    }

    public static Node DeleteKNode(Node head, int k) {

        if (head == null) {
            return null;
        }
        int count = 0;
        Node kNode = head;
        while (kNode != null) {
            count++;
            if (count == k) {
                break;
            }
            kNode = kNode.next;
        }
        Node prev = kNode.back;
        Node front = kNode.next;

        if (prev == null && front == null) {
            return null;
        } else if (prev == null) {
            return deleteHead(head);
        } else if (front == null) {
            return deleteTail(head);
        }
        prev.next = front;
        front.back = prev;
        kNode.next = null;
        kNode.back = null;
        return head;
    }

      public static void deleteNode(Node temp)
    {
        Node prev  = temp.back;
        Node front = temp.next;

        if(front == null)
        {
            prev.next = null;
            return;
        }
        prev.next =  front;
        front.back = prev;
    }




    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6};
        Node head = convertArr2DLL(arr);
        // print(head);
        // head = deleteHead(head);
        // print(head);
        // head = deleteTail(head);
        // print(head);
        // head = DeleteKNode(head, 3);
        // print(head);
        deleteNode(head.next.next.next.next.next);
        print(head);
    }

}

class Node {
    int data;
    Node next;
    Node back;

    public Node(int data, Node next, Node back) {
        this.next = next;
        this.data = data;
        this.back = back;

    }

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}
