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
import java.util.ArrayList;

public class Solution {
    static TreeNode firstViolation, secondViolation, prev;
    static ArrayList<Integer> swappedValues = new ArrayList<Integer>();

    public static ArrayList<Integer> solve(TreeNode A) {

        firstViolation = secondViolation = prev =null;
        findViolations(A);
        if(firstViolation != null && secondViolation!=null){
            swappedValues.add(0,secondViolation.val);
            swappedValues.add(1,firstViolation.val);
        }

        return swappedValues;
    }

    public static void findViolations(TreeNode root)
    {
        if(root==null)
            return;

        findViolations(root.left);

        if(prev!= null && root.val < prev.val)
        {
            if(firstViolation == null)
            {
                firstViolation = prev;
                secondViolation = root;
            }

            else
                secondViolation =root;
        }

        prev = root;
        findViolations(root.right);
    }

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

        root = new TreeNode(6);
        root.left = new TreeNode(10);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(12);
        root.right.left = new TreeNode(7);

        System.out.println("Inorder Traversal"+
                " of the original tree");
        printInorder(root);

        System.out.println(" ");
        System.out.println(solve(root));

    }
}
