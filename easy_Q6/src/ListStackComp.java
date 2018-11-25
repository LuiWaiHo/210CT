/**
 * Title:         ListStack.java
 * Description:   A Stack class by composition using LinkedList object
 * Company:       ICT HKIVE(TY)
 * @author        Patrick Tong
 */

import java.util.EmptyStackException;

public class ListStackComp  {

	private LinkedList list;	// compose with a LinkedList object

    public ListStackComp() {   // <== constructor, different from ListStack.java
		list = new LinkedList();
    }

	public boolean empty() {

		if (list == null)
		{
			return true;
		}
		return false;
	}

	public Object push(Object item) {

		list.addToHead(item);
		return list;
	}

	public Object pop() {
		if (list == null)
		{
			System.out.println("the stack is Null");
			return list;
		}
		LinkedList cur = list;
		list.removeFromHead();
		return cur.toString();
	}

	public Object peek() {
		return list.get_head();
	}

	public int search(String  item) {
		return list.search(item);

	}


	// Provide also the toString() method (for TestStack.java)
	public String toString() {
		LinkedList current = list;
		return current.toString();
	}

}