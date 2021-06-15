package CreatingSolutions;

public class Solution {
    static Node first, second, prev;

    public static Node solve(Node A) {

        first = second = prev = null;

        if(A!=null)
            inorderTraversal(A);

        if (first != null  && second!= null)
            swapNodes(first , second);

        return A;
    }

    public static void inorderTraversal(Node root)
    {
        if(root==null)
            return;
        inorderTraversal(root.left);

        if (prev !=null && root.val < prev.val) {

            if (first == null) {
                first = prev;
                second = root;
            } else second = root;
        }

        prev = root;
        inorderTraversal(root.right);
    }

    public static void swapNodes(Node A, Node B)
    {
       int temp =  A.val;
       A.val = B.val;
       B.val = temp;
    }

    static void printInorder(Node node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(" " + node.val);
        printInorder(node.right);
    }
    public static void main(String[] args) {

        Node root = null;

         root = new Node(6);
        root.left = new Node(10);
        root.right = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(12);
        root.right.left = new Node(7);

        System.out.println("Inorder Traversal"+
                " of the original tree");
        //BinaryTree tree = new BinaryTree();
        printInorder(root);

        System.out.print(" ");
        printInorder(solve(root));

        //System.out.println("\nInorder Traversal"+
        //" of the fixed tree");
        //tree.printInorder(root);
    }
}





