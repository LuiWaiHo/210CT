/**
 * @Author Lui
 * @create 2018-10-21-下午 08:57
 **/
class BinaryNode
{
    public int data;
    public BinaryNode left;
    public BinaryNode right;
    public BinaryNode(int data)
    {
        this.data = data;
        left = right = null;
    }
    public BinaryNode()
    {
        return;
    }
}
public class BST {
    BinaryNode root ;
    public int traverse(int data)
    {
        BinaryNode result;
        result = traverse(data,root);
        if (result != null) {
            System.out.print("found it ! index ");
            return result.data - 1;
        }
        else
        {

            System.out.print("not find ! ");
            return -1;
        }
    }
    public BinaryNode traverse(int data, BinaryNode bst)
    {
        BinaryNode cur = bst;

        if (root == null)
        {
            return null;
        }

        // if the left node or right of current node is null it will return;
        if (data<cur.data )
        {
            if (cur.left != null)
            {

                return traverse(data, cur.left);

            }
            else
            {
                return null;
            }
        }

        else if (data>cur.data)
        {
            if (cur.right != null)
            {
                return traverse(data, cur.right);
            }
            else
            {
                return null;
            }
        }
        else
        {

            return cur;
        }
    }

    public void Insert(int data)
    {
        root = Insert(data,root);
    }

    public BinaryNode Insert(int data, BinaryNode bst)
    {

        // The left child node is less than parent node, the right node is greater than parent node
        if (bst == null)
        {
            root = new BinaryNode(data);
            return root;
        }
        if (data>bst.data)
        {
            bst.right =  Insert(data, bst.right);
        }
        if (data<bst.data)
        {
            bst.left =  Insert(data, bst.left);
        }
        return bst;
    }

    public void print_out ()
    {
        //System.out.println("Pre-order traversal");
        //preorder(root);
        //System.out.println();
        System.out.println("in-order traversal");
        inorder(root);
        //System.out.println();
        //System.out.println("pro-order traversal");
        //postorder(root);
    }
    public BinaryNode preorder (BinaryNode bst)
    {
        if (bst == null)
        {
            //System.out.println("visited");
            return null;
        }
        System.out.print(bst.data + " ");
        preorder(bst.left);
        preorder(bst.right);
        return bst;
    }
    public BinaryNode inorder (BinaryNode bst)
    {
        if (bst == null)
        {
            //System.out.println("visited");
            return null;
        }
        inorder(bst.left);
        System.out.print(bst.data + " ");
        inorder(bst.right);

        return bst;
    }
    public BinaryNode postorder (BinaryNode bst)
    {
        if (bst == null)
        {
            //System.out.println("visited");
            return null;
        }
        postorder(bst.left);
        postorder(bst.right);
        System.out.print(bst.data + " ");
        return bst;
    }
    public void max()
    {
        Find_max(root);
    }
    public void Find_max (BinaryNode bst)
    {
        if (bst.right != null)
        {

            Find_max(bst.right);
        }
        else
        {
            System.out.println("the max number in this tree: " + bst.data);
            return ;
        }
    }
}
