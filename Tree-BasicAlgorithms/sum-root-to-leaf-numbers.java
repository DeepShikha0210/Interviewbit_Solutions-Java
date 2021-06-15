public class Solution {
    
    public int sumNumbers(TreeNode A) {
        return sum(A, 0)%1003;
    }
    
    public int sum(TreeNode root, int path) {
        
        if (root == null) return 0;
        
        if (root.left == null && root.right == null) {
            return (path*10 + root.val)%1003;
        }
    
        path = path*10 + root.val;
        path %= 1003;
        int ans = (sum(root.left, path) + sum(root.right, path));
        
        return ans%1003;
    }
}

/********************************************************************************************/
class Solution{
public int sumRootToLeaf(TreeNode root)
{
return dfs(root, 0);
}

int dfs(TreeNode root, int path)
{

   if(root == null)
      return 0;
	  
	path = path*10 + root.val;  
	  
   if(root.left == null && root.right == null)
      return path;
	  
	return dfs(root.left, path) + dfs(root.right, path);  
}
}	