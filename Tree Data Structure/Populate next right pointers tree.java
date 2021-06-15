
class Solution{
public void connect(TreeLinkNode root)
{
if( root == null)
   return;
   
  Queue<TreeLinkNode> queue = new LinkedList<>();
  queue.offer(root);
  while(!queue.isEmpty())
  {
	  int size = queue.size();
	  
	  while(size-- > 0){
	 TreeLinkNode temp =  queue.poll();
	 
	 if(size == 0)
	 temp.next=null;
     
	 else
	 temp.next=queue.peek();    	 
	 
 
	 if(temp.left!=null)
	   queue.offer(temp.left);
	   
	  if(temp.right!=null)
	   queue.offer(temp.right); 	      
  }
  }
  
  }
  }