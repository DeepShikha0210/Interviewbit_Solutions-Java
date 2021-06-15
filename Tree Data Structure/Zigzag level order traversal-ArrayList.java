class Solution{
ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root)
{
    boolean flag= false;
    ArrayList<ArrayList<Integer>> output= new ArrayList<>(); 

	Queue<TreeNode> queue = new LinkedList<>();
	
	queue.offer(root);
	
	while(!queue.isEmpty())
	{
	   int size = queue.size();
	   ArrayList<Integer> temp= new ArrayList<Integer>();
	   
	   while(size-- > 0){	   
	     TreeNode current = queue.poll();
		 if(flag)
		temp.add(0, current.val);
		else
		temp.add(current.val);
		if(current.left != null) 
		queue.offer(current.left);
		if(current.right != null) 
		queue.offer(current.right);
	   }
	   
	   
	   output.add(temp);	   
	   flag = !flag;
	   
	 } 
	  return output;
}
}