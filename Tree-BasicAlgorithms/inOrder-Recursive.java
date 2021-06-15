class Solution{
	
ArrayList<Integer> result = new ArrayList<>();
	
public ArrayList<Integer> inOrder(TreeNode root)
{
inOrder(root);
return result;
}


public void inorder(TreeNode A)
{
	if(root==null)
		return;
	inOrder(root.left);
    result.add(root);
    inOrder(root.right);
	
}	
}