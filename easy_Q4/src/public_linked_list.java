import java.util.List;

/**
 * @Author Lui
 * @create 2018-10-20-下午 07:35
 **/
//Node constructor
class ListNode {
    public Object data;
    public ListNode next;
    public ListNode(Object o)
    {
        data = o;
    }
} // class ListNode

class EmptyListException extends RuntimeException {
    public EmptyListException () { super ("List is empty"); }
} // class EmptyListException

class public_linked_lisk {
    public ListNode head;
    public ListNode tail;
    public boolean isEmpty() { return head == null; }
    public void addToHead(Object item)
    {
        ListNode new_node = new ListNode(item);
        if (head == null)
        {
            head = new_node;
            return;
        }
        /*
        *   if the linked list is null ,the head address will be point to new_node address
        */

        new_node.next = head; //the new node point the next to the old head of the linked list as a new head node
        head = new_node;
        return;
    }
    public void addToTail(Object item)
    {
        ListNode new_node = new ListNode(item);
        if (head == null)
        {
            head = new_node;
            return;
        }
        /*
         *   if the linked list is null ,the head address will be point to new_node address
         */
        ListNode cur = head; // declare the variable current, and point to the first node address
        ListNode prv = cur;  //declare the prv and point to the prv of the cur node
        cur = cur.next;    //point the cur address to front of the prv node

        while (cur != null)
        {
            cur = cur.next;
            prv = prv.next;
        }
        /*
        * get out of the loop when the cur node is null
         */
        prv.next = new_node;
        return;
    }
    public Object removeFromHead()
    {
        if (head == null)
        {
            return -1;
        }
        /*
         * if the head is null , just return
         */
        ListNode cur = head;
        head = cur.next;   //declare the cur and point to head, then point the head to the next of current node
        return cur.data;
    }
    public Object removeFromTail()
    {
        if (head == null)
        {
            return -1;
        }
        /*
         * if the head is null , just return
         */
        ListNode cur = head;
        if (cur.next == null)
        {

            Object tmp = cur.data;
            head = null;
            return tmp;
        }
        /*
         * if the second node is null , point the head node to null
         */

        while (cur.next.next != null)
        {
            cur = cur.next;

        }
        /*
         * get out of the loop when the next node of next node of current node is null
         */

        Object tmp = cur.next.data;
        cur.next = cur.next.next; //the current node will point to the null for remove the tail node
        return tmp;
    }
    public String toString () {
        String s = "[ ";
        ListNode current = head;
        while (current != null) {
            s += current.data + " ";
            current = current.next;
        }
        return s + "]";
    }


} // class LinkedList
