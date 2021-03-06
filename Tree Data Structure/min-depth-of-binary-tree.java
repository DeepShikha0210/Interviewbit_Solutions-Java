public class Solution {


    public int minDepth(TreeNode A) {
        if (A == null) return 0;
        
        if (A.left == null && A.right != null) return 1 + minDepth(A.right);
        if (A.left != null && A.right == null) return 1 + minDepth(A.left);
        
        return 1 + Math.min(minDepth(A.left), minDepth(A.right));
    }
}