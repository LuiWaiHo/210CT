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
    public int position_Find(int data)
    {
        BinaryNode result;
        result = position_Find(data,root);
        System.out.print("found it ! ");
        return result.data;
    }
    public BinaryNode position_Find(int data, BinaryNode bst)
    {
        BinaryNode cur = bst;

        if (root == null)
        {
            return null;
        }

        if (data<cur.data )
        {
            // if the data is small than current node, go to the left child tree

            return position_Find(data, cur.left);
        }
        else if (data>cur.data)
        {
            // if the data is small than current node, go to the right child tree
            return position_Find(data, cur.right);
        }
        else
        {
            //The search succeeds, returning the address of the found node of the node
            return cur;
        }
    }

    public void Insert(int data)
    {
        root = Insert(data,root);
    }

    public BinaryNode Insert(int data, BinaryNode bst)
    {

        if (bst == null)
        {
            // if the tree is null, Generate and return a binary search tree for a node
            root = new BinaryNode(data);
            return root;
        }
        //Start looking for the location where you want to insert the element
        if (data>bst.data)
        {
            //Recursively inserting the right subtree
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

    public void traversal ()
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
        //Start from the left of the tree, to the middle end,
        // and finally to the right.
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
    /*public void max()
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

            System.out.println(bst.data);
            return ;
        }
    }*/
    public void delete (int data)
    {
        System.out.println("delete : "+ data);
        System.out.println("befor del");
        inorder(root);
        delete(root , data);
        System.out.println();
        System.out.println("after del");
        inorder(root);
    }
    public BinaryNode delete (BinaryNode bst, int data)
    {
        BinaryNode tmp;
        if (data<bst.data)
        {
            bst.left = delete(bst.left, data);//Left subtree recursively deleted
            return bst;
        }
        if (data>bst.data)
        {

            bst.right = delete(bst.right,data);//right subtree recursively deleted
            return bst;
        }
        else {
            //Successfully found the node to delete


            //A deleted node has only one node or no node
            if (bst.left == null && bst.right == null) {

                return null;
            }


            else if (bst.right == null && bst.left!=null)
            {
                bst = bst.left;
                return bst;

            }
            else if (bst.left == null && bst.right!=null)
            {
                bst = bst.right;
                return bst;

            }
            //The nodes that are deleted have nodes on the left and right
            else if (bst.left != null && bst.right != null)
            {
                //Find the smallest element in the right subtree to fill the deleted node
                tmp = Find_min(bst.right);
                bst.data = tmp.data;
                //Delete the smallest element in the right subtree of the deleted node
                bst.right = delete(bst.right, tmp.data);

            }

        }return bst;

    }

    public BinaryNode Find_min(BinaryNode bst)
    {
        //The minimum data usually at the left node, so keep looking to the left node.
        while (bst.left!=null)
        {
            bst = bst.left;
        }
        return bst;
    }
}
