class Solution{
public int maxDepth(TreeNode root)
{
int height =0;
int nodeCount=0; //Number of nodes at current level
if( root == null)
   return 0;
   
  Queue<TreeNode> queue = new LinkedList<>();
  queue.add(root);
  while(!queue.isEmpty())
  {
	  // nodeCount (queue size) indicates number of nodes
            // at current level.
     nodeCount = queue.size();
	 if(nodeCount == 0)
	    return height;
	 height++;
	 
	 // Dequeue all nodes of current level and Enqueue all
            // nodes of next level
	 
	 while(nodeCount >0)
	 {
	    TreeNode temp = queue.poll();
		if(temp.left!= null)
		  queue.offer(temp.left);
		if(temp.right!=null)
           queue.offer(temp.right);
		 nodeCount--;
      } 
  }
  
  return height;
   }
   }
   