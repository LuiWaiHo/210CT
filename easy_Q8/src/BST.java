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

        // if the left node or right of current node is null it will return;
        if (root == null)
        {
            return null;
        }

        // if the data is small than current node, go to the left child tree

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
// if the data is small than current node, go to the right child tree

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
        //The search succeeds, returning the address of the found node of the node

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
// if the tree is null, Generate and return a binary search tree for a node

        if (bst == null)
        {
            root = new BinaryNode(data);
            return root;
        }
        //Start looking for the location where you want to insert the element

        if (data>bst.data)
        {//Recursively inserting the right subtree
            bst.right =  Insert(data, bst.right);
        }
        if (data<bst.data)
        {
            //Recursively inserting the left subtree
            bst.left =  Insert(data, bst.left);
        }
        //else x already exists, do nothing
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
    {   //The maximum data usually at the right node, so keep looking to the right node.

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
