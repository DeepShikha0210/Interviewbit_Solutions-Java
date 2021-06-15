class Solution{
	
ArrayList<Integer> result = new ArrayList<>();
	
public ArrayList<Integer> preOrder(TreeNode root)
{
preOrder(root);
return result;
}


public void inorder(TreeNode A)
{
	if(root==null)
		return;
	
    result.add(root);
	preOrder(root.left);
    preOrder(root.right);
	
}	
}