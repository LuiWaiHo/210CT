/**
 * Title:          TestStack.java
 * Description:    Test driver for Stack class
 *
 * Company:        ICT HKIVE(TY)
 * @author         Patrick Tong
 */

import java.util.Stack;
import java.util.Iterator;

public class TestStack {
	public static void main (String args[]) throws ExceptionQueueFull {
		ListStack s = new ListStack(5);
		System.out.println(s);
		System.out.println("Patrick is at " + s.search("Patrick"));
		s.push("Cat");
		System.out.println(s);
		s.push("Dog");
		System.out.println(s);
		s.push(new Integer(123));
		System.out.println(s);
		s.push("Patrick");
		System.out.println(s);
		s.push(new Character('E'));
		System.out.println(s);
		s.push(new Double(789.123));
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println("peek() returns: " + s.peek());
		System.out.println("search() returns: " + s.search("123"));


		System.out.println();
	}

} // class TestStack