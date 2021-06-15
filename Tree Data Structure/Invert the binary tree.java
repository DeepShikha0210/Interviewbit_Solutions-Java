class Solution
{
public TreeNode invertTree(TreeNode root)
{ 
    if(root == null)
	return root;
	
	TreeNode left = invertTree(root.left);
	TreeNode right = invertTree(root.right);
	
	root.right = left;
	root.left = right;
	
	return root;
}
}

/********************************************************************************************/
class Solution
{
public TreeNode invertTree(TreeNode root)
{   
    swap(root);
   return root;
   
 }
  void swap(TreeNode root)
{
     
	 if(root ==null)
	 return; 
	 
	 swap(root.left);
	 swap(root.right);
	 
    TreeNode temp = root.left;
     root.left = root.right;
     root.right= temp;

} 
}