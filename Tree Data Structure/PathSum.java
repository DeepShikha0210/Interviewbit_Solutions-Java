public class Solution {
    public int hasPathSum(TreeNode A, int B) {
        
        if(A==null)
        return 0;
        
        if(A.right== null && A.left == null)
        return (B-A.val == 0) ? 1: 0;
        
        B-=A.val;
        
        return Math.max(hasPathSum(A.left, B), hasPathSum(A.right, B));
        
     }
    }