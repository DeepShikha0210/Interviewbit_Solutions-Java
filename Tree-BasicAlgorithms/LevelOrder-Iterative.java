class Solution{
public ArrayList<Integer> solve(TreeNode root)
{
ArrayList<Integer> result = new ArrayList<>();

if( root == null)
   return result;
   
  Queue<TreeNode> queue = new LinkedList<>();
  queue.add(root);
  while(!queue.isEmpty())
  {
     TreeNode temp = queue.poll();
	 result.add(temp.val);
	 if(temp.left!=null)
	   queue.offer(temp.left);
	   
	  if(temp.rightt!=null)
	   queue.offer(temp.right)	   
	   
  }
  
  return result;
  }
  }