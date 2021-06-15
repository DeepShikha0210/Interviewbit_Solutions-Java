/*Linear solution using path calculation :

1) Find path from root to n1 and store it in a vector or array.
2) Find path from root to n2 and store it in another vector or array.
3) Traverse both paths till the values in arrays are same. Return the common element just before the mismatch

Linear solution using recursion :

We traverse from the bottom, and once we reach a node which matches one of the two nodes, we pass it up to
 its parent. The parent would then test its left and right subtree if each contain one of the two nodes. 
 If yes, then the parent must be the LCA and we pass its parent up to the root. If not, we pass the lower
 node which contains either one of the two nodes (if the left or right subtree contains either p or q), 
 or NULL (if both the left and right subtree does not contain either p or q) up.*/
 
//Linear Recursive 
public class Solution {
    
    public boolean find(TreeNode root, int k)
    {
    // Base Case
        if (root == null)
            return false;
        return  (root.val == k || find(root.left, k) ||  find(root.right, k));
    }
    
    public TreeNode lca_util(TreeNode root, int val1, int val2) {
        
	    if(root == null || root.val == val1 || root.val == val2) return root;
	    TreeNode left = lca_util(root.left, val1 , val2);
	    TreeNode right = lca_util(root.right, val1 , val2);
	    if(left!=null && right!=null) return root;
	    return left!=null ? left : right ;
    }
    
	public int lca(TreeNode root, int val1, int val2) {
        if(!find(root, val1) || !find(root, val2))
            return -1;
        TreeNode result =  lca_util(root ,val1, val2); 
        return result!= null? result.val : -1;
	}
}
   


/***************************************************************************************/
//Works only for BST
class Solution{

public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B)
{

    if(root == A || root == B)
	return root;

   if(A.val < root.val && B.val < root.val)
       return lowestCommonAncestor(root.left , A, B);
	   
	if(A.val > root.val && B.val > root.val)
       return lowestCommonAncestor(root.right , A, B);   


    return root;

}	
	   