class Solution{
public ArrayList<Integer> inOrder(TreeNode root)
{
ArrayList<Integer> result = new ArrayList<>();

if( root == null)
   return result;
   
 Stack<TreeNode> stack = new Stack<>();
   TreeNode current  =root;
   while(!stack.isEmpty() || temp!=null)
   {
       if(temp!=null)
	   {
	      stack.push(current);
		  current=current.left;
		}

        else
         { 
          TreeNode temp=stack.peek().right;
		  if(temp == null){
		  temp =stack.poll();
		  result.add(temp);
		  while(!stack.isEmpty() && temp ==stack.peek().right)
		  {
		  temp = stack.poll();
		  result.add(temp);
		  }
		  }
		  else
		  current=temp;
		  
		  }
		}
		return result;
}
}	
/*********************************************************************************************/

public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<Integer> postorder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
       
        if (A==null) 
        return postorder;
       
        stack.push(A);
        
        while(!stack.isEmpty()){
            TreeNode t = stack.pop();
            postorder.add(0,t.val);
            
            if(t.left!=null) 
            stack.push(t.left);
            if(t.right!=null)
            stack.push(t.right);
        }
        return postorder;
    }
}
	
 //PreOrder is Root-Left-Right
//This is doing preorder in reverse but taking path Root-Right-Left and doing its reverse by adding at index 0 each time
//which makes it Left-Right-Root i.e. the postOrder traversal.