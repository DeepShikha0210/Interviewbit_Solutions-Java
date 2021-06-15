class Solution{
	
ArrayList<Integer> result = new ArrayList<>();
	
public ArrayList<Integer> postOrder(TreeNode root)
{
postOrder(root);
return result;
}


public void inorder(TreeNode A)
{
	if(root==null)
		return;
	postOrder(root.left);
    postOrder(root.right);
	result.add(root);
	
}	
}

/*******************************************************************************************

Function Call       Line Number    root                             9
postOrder()           16            9                             /  \
postOrder()           16            2                             2     3
postOrder()           16            4                            / \   / \
postOrder()			  X  		  null  					   4  null 	 null
postOrder()           17			4						  / 
postOrder()           x 		  null  					 null
result.add(4)

*******************************************************************************************/