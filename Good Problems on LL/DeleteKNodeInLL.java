/****************************************************************

	Following is the Node class already written for the Linked List

	class  Node<T> {
    	T data;
    	 Node<T> next;
    
    	public  Node(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/
class  Node<T> {
    T data;
     Node<T> next;

    public  Node(T data) {
        this.data = data;
    }
}

public class DeleteKNodeInLL {
	public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		// Write your code here.

		if(pos == 0 )
		{
			return head.next;
		}
		Node<Integer> prev = null;
		Node<Integer> curr = head;
		int k = 0;
		while(k!= pos && curr!=null)
		{
			prev = curr;
			curr = curr.next;
			k++;
		}
		if(curr == null)
		{
			return head;
		}
		else
		{
			prev.next = curr.next;
		}
		return head;
	}
}