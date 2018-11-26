import java.security.PublicKey;

class ListNode {
	private  Object data;
	private  ListNode next;
	public ListNode(Object o) { data = o; next = null; }
	public ListNode(Object o, ListNode nextNode)
	{ data = o; next = nextNode; }
	public Object getData() { return data; }
	public ListNode getNext() { return next; }
	public void setData(Object o, ListNode curNode) { curNode.data = o; }
	public void setNext(ListNode nextNode, ListNode curNode) { curNode.next = nextNode; }
} // class ListNode

class EmptyListException extends RuntimeException {
	public EmptyListException () { super ("List is empty"); }
} // class EmptyListException

class LinkedList {
	private ListNode head;
	private ListNode tail;
	public LinkedList() { head = tail = null; }
	public boolean isEmpty() { return head == null; }
	public void addToHead(Object item) {
		ListNode new_node = new ListNode(item);
		if (isEmpty())
		{
			this.head = new_node;
			this.tail = new_node;
			/*
			 *   if the linked list is null ,the head and tail address will be point to new_node address
			 */
		}
		else
		{
			ListNode cur = this.head;//the new node point the next to the old head of the linked list as a new head node

			ListNode tmp = cur;
			ListNode node= new ListNode(new_node.getData(),tmp);

			this.head = node;
		}
	}
	public void addToTail(Object item) {
		ListNode new_node = new ListNode(item);
		if (isEmpty())
		{
			this.head = new_node;
			this.tail = new_node;
		}
		else
		{/*
		 *   if the linked list is null ,the head address will be point to new_node address
		 */
			ListNode cur = this.head;// declare the variable current, and point to the first node address

			while (cur.getNext() != null)
			{
				cur = cur.getNext() ;
			}/*
			 * get out of the loop when the next node is null
			 */
			cur.setNext(new_node,cur);

		this.tail = new_node;
		}
	}
	public Object removeFromHead() throws EmptyListException {
		if ( isEmpty() ) // throw exception if List is empty
			throw new EmptyListException();

		ListNode cur = this.head;//declare the cur and point to head, then point the head to the next of current node

		// if head and tail node data is same that mean the list only has one node
		if (this.head == this.tail)
		{
			this.head = this.tail = null;
			return cur.getData();
		}

		

		ListNode tmp = cur.getNext() ;
		this.head = tmp;


		return cur.getData();

	}
	public Object removeFromTail() throws EmptyListException {
		if ( isEmpty() ) // throw exception if List is empty
			throw new EmptyListException();
		ListNode prev = this.head;
		ListNode cur = prev.getNext() ;

		if (this.head == this.tail)
		{
			ListNode head = this.head;
			this.head = this.tail = null;
			return head.getData();
		}
		while (cur.getNext()  != null)
		{
			prev = prev.getNext() ;
			cur = cur.getNext() ;
		}
		prev.setNext(null,prev);
		this.tail = prev;
		return cur.getData();
	}
	public String toString () {
		String s = "[ ";
		ListNode current = head;
		while (current != null) {
			s += current.getData() + " ";
			current = current.getNext() ;
		}
		return s + "]";
	}
} // class LinkedList
