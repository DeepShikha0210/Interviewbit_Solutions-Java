/* When are the 2 trees the same ?
When the root values are the same, and left subtree of both trees are same,
 and right subtree of both trees are the same*/
 
 public class Solution {
    public int isSameTree(TreeNode A, TreeNode B) {
        
    if(A == null && B==null)
     return 1;
     
     if(A==null || B ==null)
     return 0;
     
     return (A.val == B.val && isSameTree(A.left, B.left)==1 && isSameTree(A.right, B.right)==1) ? 1 : 0;
    }
}