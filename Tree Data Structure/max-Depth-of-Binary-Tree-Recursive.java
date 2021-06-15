public class Solution {
    public int maxDepth(TreeNode A) {
        
        if(A== null)
        return 0;
        
        return Math.max(maxDepth(A.right), maxDepth(A.left)) +1;
        
    }
}