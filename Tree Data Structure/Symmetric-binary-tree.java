/* 2 trees T1 and T2 are symmetric if
1) value of T1’s root is same as T2’s root
2) T1’s left and T2’s right are symmetric.
3) T2’s left and T1’s right are symmetric.*/


public class Solution {
    
  
    public int isSymmetric(TreeNode A) {
    
    return isMirror(A.left,A.right);
    
    }
    
    public int isMirror(TreeNode A, TreeNode B)
    {
        if(A == null && B== null)
        return 1;
        
        if(A==null || B==null)
        return 0;
        
        return ((A.val==B.val) && isMirror(A.right , B.left)==1 && isMirror(A.left , B.right)==1) ? 1 : 0;
    }
}
