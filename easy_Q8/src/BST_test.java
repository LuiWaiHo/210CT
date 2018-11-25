/**
 * @Author Lui
 * @create 2018-10-21-下午 09:20
 **/
public class BST_test {
    public static void main(String []args)
    {
        BST bst = new BST();
        bst.Insert(2);
        bst.Insert(7);
        bst.Insert(15);
        bst.Insert(4);
        bst.Insert(1);
        bst.Insert(5);
        bst.Insert(85);
        bst.Insert(6);
        bst.Insert(0);
        bst.Insert(8);
        bst.max();
        System.out.println(bst.traverse(8));
        bst.print_out();

    }
}
