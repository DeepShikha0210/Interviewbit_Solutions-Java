/*A tree is balanced if :
1) Left subtree is balanced
2) Right subtree is balanced
3) And the difference is height of left and right subtree is atmost 1.

Can you think of a way to simulate that with recursion ?
Note that depth of a tree can also be calculated recursively as max(depth(rightSubtree), depth(leftSubtree)) + 1.*/


public class Solution {

    static int isBalancedBT = 1;
    public static int solve(TreeNode A) {
        getHeight(A);
        return isBalancedBT;
    }

       public static int getHeight(TreeNode curr) {
        if(curr == null)
            return 0;
        int lHt = getHeight(curr.left);
        int rHt = getHeight(curr.right);
        if(Math.abs(lHt-rHt) > 1) {
            isBalancedBT = 0;
        }
        return 1 + Math.max(lHt, rHt);
    }
