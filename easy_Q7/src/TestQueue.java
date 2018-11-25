/**
 * Title:       TestQueue2.java
 * Description: A test drive program for the Queue class
 * 				Used SimpleInput class methods for inputs
 * Company:     ICT HKIVE(TY)
 * @author      Patrick Tong
 */

import miscLib.SimpleInput;
import miscLib.GenLib;

public class TestQueue {

    public static void main(String[] args) throws ExceptionQueueFull {
		ListQueue q = new ListQueue(20);
//		ArrayQueue q = new ArrayQueue(20);
		byte barray[] = new byte[20];
		int n;
		do {
			n = SimpleInput.getInteger("How many to enqueue? ");
			for (int i = 0; i < n; i++) {
				q.enqueue(new Integer(GenLib.genInt(1, 100)));
				System.out.println(q);
			}
			n = SimpleInput.getInteger("How many to dequeue? ");
			for (int i = 0; i < n; i++) {
				if (q.empty()) {
					System.out.println("Queue is now empty, dequeue ignored.");
					break;
				} else {
					System.out.println("dequeued:"+q.dequeue());
					System.out.println(q);
				}
			}
		} while (SimpleInput.getChar("more (y/n)? ") == 'y');

		System.out.println("Bye now.");
		System.exit(0);
    }

} // clas TestQueue