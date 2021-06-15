class Solution{
public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root)
{
ArrayList<ArrayList<Integer>> result = new ArrayList<>();

if( root == null)
   return result;
   
  Queue<TreeNode> queue = new LinkedList<>();
  queue.add(root);
while(!queue.isEmpty)
{
   ArrayList<Integer> current_level = new ArrayList<>();
   for(int i =0 ; i< queue.size(); i++)
   {
    TreeNode current = queue.poll();
    current_level.add(current);
    if(current.left!= null)
    queue.add(current.left);
    if(current.right!=null)
    queue.add(current.right);
}
result.add(current_level);
}
return result;
}
}   