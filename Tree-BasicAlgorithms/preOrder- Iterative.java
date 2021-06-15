class Solution{
public ArrayList<Integer> preOrder(TreeNode root)
{
ArrayList<Integer> result = new ArrayList<>();

if( root == null)
   return result;
   
  Stack<TreeNode> stack = new Stack<>();
  stack.push(root);
while(!stack.isEmpty)
{
  TreeNode current = stack.pop();
  result.add(current);
  if(current.right!=null)
  stack.push(current.right);
  if(current.left!=null)
  stack.push(current.left);
  }
  
  return result;
  
  }
  