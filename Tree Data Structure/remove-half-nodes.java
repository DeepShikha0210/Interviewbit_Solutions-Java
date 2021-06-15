/* The idea is to use post-order traversal to solve this problem efficiently.
We first process the left children, then right children, and finally the node itself.
So we form the new tree bottom up, starting from the leaves towards the root.
By the time we process the current node, both its left and right subtrees were already processed.

Time complexity of the above solution is O(N) as it does a simple traversal of binary tree */

package CreatingSolutions;

public class Solution {


    public static TreeNode solve(TreeNode A) {
        removeHalfNodes(A);
        return A;
    }
    public static TreeNode removeHalfNodes(TreeNode A) {
        if (A == null)
            return A;

        A.left = removeHalfNodes(A.left);
        A.right = removeHalfNodes(A.right);

        if ((A.right == null && A.left != null) || (A.right != null && A.left == null)) {
            if (A.right == null)
                return A.left;
            if (A.left == null)
                return A.right;
        }
        return A;
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

        root = new TreeNode(2);
        root.left = new TreeNode(7);
        root.right = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(1);
        root.left.right.right = new TreeNode(11);
        root.right.right = new TreeNode(9);
        root.right.right.left = new TreeNode(4);

        System.out.println("Inorder Traversal"+
                " of the original tree");
        printInorder(root);
        int B=5;
        System.out.println(" ");
        printInorder(solve(root));

    }
}





