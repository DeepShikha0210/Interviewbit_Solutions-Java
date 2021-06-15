/*For each level whenever you encounters the last node on that level append it to the answer.

try to Modify the level order traversal of tree for this problem.*/

class Solution{
public ArrayList<Integer> solve(TreeNode root)
{
ArrayList<Integer> result = new ArrayList<>();

if( root == null)
   return result;
   
  Queue<TreeNode> queue = new LinkedList<>();
  queue.offer(root);
  while(!queue.isEmpty())
  {
	  int size = queue.size();
	  
	  while(size-- > 0){
     TreeNode temp = queue.poll();
     if(size == 0)
	 result.add(temp.val);
 
	 if(temp.left!=null)
	   queue.offer(temp.left);
	   
	  if(temp.right!=null)
	   queue.offer(temp.right);      
	   
  }
  
  return result;
  }
  }