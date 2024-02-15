class GfG
{
    public static Node quickSort(Node node)
    {
        //Your code here
        
        Node  temp = node;
        Node prev = null;
        
        while(temp!=null)
        {
            prev = temp ;
            temp = temp.next;
        }
        QuickSort(node,prev);
        return node;
        
    }
    
    public static void QuickSort(Node start,Node end)
    {
        if(start == null || start == end || start == end.next)
        {
            return;
        }
        Node pivot_prev = partitionLast(start,end);
        QuickSort(start,pivot_prev);
    
        if(pivot_prev != null && pivot_prev == start)
        {
            QuickSort(pivot_prev.next,end);
        }
        else if(pivot_prev != null && pivot_prev.next != null)
        {
            QuickSort(pivot_prev.next.next,end);
        }
    }
    
    public static Node partitionLast(Node start,Node end)
    {
        if(start == end || start == null || end == null)
        {
            return start;
        }
        Node pivot_prev = start;
        Node curr = start;
        int pivot = end.data;
        
        while(start != end)
        {
            if(start.data < pivot)
            {
                pivot_prev = curr;
                int temp = curr.data;
                curr.data = start.data;
                start.data = temp;
                curr = curr.next;
            }
            start = start.next;
        }
        int temp = curr.data;
        curr.data = pivot;
        end.data = temp;
        
        return pivot_prev;
    }
    
    
    

}