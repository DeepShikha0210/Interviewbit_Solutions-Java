/*For each level whenever you encounters the last node on that level append it to the answer.

try to Modify the level order traversal of tree for this problem.*/
class Solution{

ArrayList<Integer> result = new ArrayList<>();

public ArrayList<Integer> solve(TreeNode root)
{
  levelOrder(root, 0);
  return result;
}

void levelOrder(TreeNode root, int currentlevel)
{
  if(root == null)
  return;
  
  if(result.size() == currentlevel)
  result.add(root.val);
  
  levelOrder(root.right, currentlevel+1);
  levelOrder(root.left, currentlevel+1);
  
 }
 }