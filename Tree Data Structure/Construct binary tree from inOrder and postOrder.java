
    // Consider the next item from the end of a given postorder sequence.
    // This value would be the root node of a subtree formed by sequence
	// search the current node index in inorder sequence to determine
    // the boundary of the left and right subtree of the current node
	 // recursively construct the right subtree
	  // recursively construct the left subtree

 class Solution{
     
     int pIndex;
 
 HashMap<Integer, Integer> map = new HashMap<>();
 
  public TreeNode buildTree(ArrayList<Integer> postOrder, ArrayList<Integer> inOrder)
 {
   if(postOrder.size() == 0 || inOrder.size() == 0) return null;
   
for(int i=0; i < inOrder.size(); i++)
    map.putIfAbsent(inOrder.get(i) , i);
	
	pIndex=postOrder.size()-1;
    
	return construct(0, inOrder.size()-1, postOrder);
   
 }
  
 TreeNode construct(int start, int end, ArrayList<Integer> postOrder)
 {
     
 if(start > end || pIndex == postOrder.size())
  return null;
  
 TreeNode root = new TreeNode(postOrder.get(pIndex--));

 int iIndex = map.get(root.val);

root.right =construct(iIndex + 1, end, postOrder);    //? why root.right before root.left
root.left  =construct( start , iIndex-1 , postOrder);


return root;

}
 
}