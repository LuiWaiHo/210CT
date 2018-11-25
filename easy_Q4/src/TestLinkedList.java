import java.util.LinkedList;

/**
 * Title:           TestLinkedList.java
 * Description:     A simple test drive program for the LinkedList class
 * Company:         ICT HKIVE(TY)
 * @author
 */

public class TestLinkedList {
	public static void main (String args[]) {
		public_linked_lisk s = new public_linked_lisk();
		System.out.println(s);
		System.out.println();
		System.out.println("adding 42 into the linked list ");
		s.addToHead (new Integer(42));
		System.out.println(s);
		System.out.println();
		System.out.println("adding 43 into the linked list ");
		s.addToHead (new Integer(43));
		System.out.println(s);
		System.out.println();
		System.out.println("adding 44 into the linked list ");
		s.addToHead (new Integer(44));
		System.out.println(s);
		System.out.println();
		System.out.println("adding 45 into the linked list ");
		s.addToTail (new Integer(45));
		System.out.println(s);
		System.out.println();
		System.out.println("adding 46 into the linked list ");
		s.addToTail (new Integer(46));
		System.out.println(s);
		System.out.println();
		System.out.println("adding 47 into the linked list ");
		s.addToTail (new Integer(47));
		System.out.println(s);
		System.out.println();
		System.out.println("removed:" + s.removeFromHead());

		System.out.println(s);
		System.out.println();
		System.out.println("removed:" + s.removeFromHead());

		System.out.println(s);
		System.out.println();
		System.out.println("removed:" + s.removeFromHead());

		System.out.println(s);
		System.out.println();

		System.out.println("removed:" + s.removeFromTail());

		System.out.println(s);
		System.out.println();
		System.out.println("removed:" + s.removeFromTail());

		System.out.println(s);
		System.out.println();
		System.out.println("removed:" + s.removeFromTail());

		System.out.println(s);
		System.out.println();

	}
} // class TestLinkedList