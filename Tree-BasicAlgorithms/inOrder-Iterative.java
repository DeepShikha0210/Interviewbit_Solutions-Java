class Solution{
public ArrayList<Integer> inOrder(TreeNode root)
{
ArrayList<Integer> result = new ArrayList<>();

if( root == null)
   return result;
   
 Stack<TreeNode> stack = new Stack<>();
   TreeNode temp  =root;
while(!stack.isEmpty || temp!=null)
{

   if(temp!=null)
   {
      stack.push(temp);
	  temp = temp.left;
	}

    else{
     temp =stack.pop();
     result.add(temp);
     temp = temp.right;
     }
}
return result;	 