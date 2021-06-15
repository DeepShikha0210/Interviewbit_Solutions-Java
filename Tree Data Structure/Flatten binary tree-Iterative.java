class Solution{
public TreeNode flatten(TreeNode root)
{
if( root == null)
   return root;
   
  Stack<TreeNode> stack = new Stack<>();
  stack.push(root);
while(!stack.isEmpty())
{
  TreeNode current = stack.pop();
  if(current.right!=null)
  stack.push(current.right);
  if(current.left!=null)
  stack.push(current.left);
  
  if(!stack.isEmpty())
   current.right= stack.peek();
   
   current.left = null;  
  
  }
  return root;
  }
  }
/**********************************************************************************/
class Solution{
public void flattenList(TreeNode root)
{
if( root == null)
   return null;
   
  Stack<TreeNode> stack = new Stack<>();
  stack.push(root);
while(!stack.isEmpty)
{
  TreeNode current = stack.pop();
  if(current.right!=null)
  stack.push(current.right);
  if(current.left!=null)
  stack.push(current.left);
  
  if(!stack.isEmpty())
   current.right= stack.peek();
   
   current.left = null;  
  
  }
  }
  }
    
  