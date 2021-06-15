class Solution{
    TreeNode prev= null;
public TreeNode flatten(TreeNode root)
{
if( root == null)
   return root;
   
   
   flatten(root.right);
   flatten(root.left);
   root.right = prev;
   root.left = null;
   prev = root;
   
   return root;
   
 }
 }
 /************************************************************************************/
 //return type void
class Solution{
public void flatten(TreeNode root)
{
if( root == null)
   return null;
   
   flatten(root.right);
   flatten(root.left);
   root.right = prev;
   root.left = null;
   prev = root;
   
 }
  
 /**************************************************************************************/
 
