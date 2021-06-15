class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
/******************************************************************************/
public class Solution {
   
    static ArrayList<Integer> path = new ArrayList<Integer>();

    public static ArrayList<Integer> solve(TreeNode A, int B) {
        find(A, B);
        return path;
    }
	
    public static boolean find(TreeNode A, int B){
        if(A==null)
            return false;

        path.add(A.val);

        if(A.val == B)
             return true;

        if ( find(A.left , B) ||  find(A.right , B))
            return true;

        path.remove(path.size()-1);
        return false;
    }

/********************************************************************************************/

    static void printInorder(TreeNode node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(" " + node.val);
        printInorder(node.right);
    }
    public static void main(String[] args) {

        TreeNode root = null;

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(6);

        System.out.println("Inorder Traversal"+
                " of the original tree");
        //BinaryTree tree = new BinaryTree();
        printInorder(root);
        int B=5;
        System.out.println(" ");
        System.out.println(solve(root,5));

    }
}