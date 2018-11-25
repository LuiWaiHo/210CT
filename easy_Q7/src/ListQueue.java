import sun.invoke.empty.Empty;

/**
 * @Author Lui
 * @create 2018-10-05-上午 11:16
 **/
class ExceptionQueueFull extends Exception {

    // Constructor
    public ExceptionQueueFull() {

    }

    // Constructor with parameters
    public ExceptionQueueFull(String mag) {
        System.out.println(mag);
    }
}

public class ListQueue extends LinkedList{
    //existing length of queue
    private static int length_of_array;
    //max length of queue
    private static int max_length;
    //declare the Length
    public ListQueue(int capacity)
    {
        System.out.println("the length of list");
        System.out.println(capacity);
        // why capacity - 1 because the list judge by length_of_array > max_length
        max_length = capacity-1;
        length_of_array = 0;
    }

    public boolean empty()
    {
        if (head == null)
        {
            return true ;
        }
        else
        {
            return false;
        }
    }
    public void enqueue (Object o)throws ExceptionQueueFull
    {

        if (length_of_array > max_length)
        {
            System.out.println("the list is full");
            return ;
        }
        length_of_array += 1;
        addToHead(o);
    }
    public Object dequeue()
    {
        length_of_array -= 1;
        ListNode cur = head;
        // cur is store the tmp data to return which data is remove
        while (cur.getNext() != null)
        {
            cur = cur.getNext();
        }
        removeFromTail();
        return cur.getData();
    }
}
