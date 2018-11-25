/**
 * Title:         ListStack.java
 * Description:   A Stack class extended from LinkedList class
 * Company:       ICT HKIVE(TY)
 * @author        Patrick Tong
 */

import java.util.EmptyStackException;
class StackNode {

	private Object data;
	private StackNode next;

	public StackNode(Object o) { data = o; next = null; }
	public StackNode(Object o, StackNode nextNode)
	{ data = o; next = nextNode; }

	public Object getData() { return data; }
	public void setData(Object o) { data = o; }

	public StackNode getNext() { return next; }
	public void setNext(StackNode next) { this.next = next; }

}
class ExceptionQueueFull extends Exception {

    // Constructor
    public ExceptionQueueFull() {

    }

    // Constructor with parameters
    public ExceptionQueueFull(String mag) {
        System.out.println(mag);
    }
}
public class ListStack extends LinkedList {
    private static int max_length;
    private static int cur_length;


	public ListStack(int max_length) {    // <== constructor, different from ListStackComp.java
		this.max_length = max_length;
		cur_length = 1;
	}

	public boolean empty() {
		return isEmpty();
	}

	public Object push(Object item) throws ExceptionQueueFull {
		//raise up error if existing length of list is grater than max length
        if (cur_length > max_length)
        {
        	return null;
            //throw new ExceptionQueueFull("stack is empty");
        }
	    cur_length += 1;
		addToHead(item);
		return item;
	}

	public Object pop() {
	    cur_length -= 1;
		ListNode cur = head;
		// pop out the head node, but if the list is null , if will raise error
		if (empty()==true)
		{
			//the removeFromHead method extended from the list
			return removeFromHead();
		}
		else
		{
			ListNode tmp = cur;
			removeFromHead();
			return tmp.getData();

		}
	}

	public Object peek() {
        return get_head();
	}


}