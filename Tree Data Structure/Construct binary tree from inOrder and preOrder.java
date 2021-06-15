  //We use preorder traversal to find the next number and inorder to find its place
        //The element we take from preorder is found out in inorder and that us to know the elements in its left subtree and in its right subtree
        //we will follow the same order vist yourself-->visit left child-->visit right child
        //We use HashMap to store indexes of Inorder array to get the query in o(1).


 class Solution{
     
     int pIndex = 0;
 
 HashMap<Integer, Integer> map = new HashMap<>();
 
  public TreeNode buildTree(ArrayList<Integer> preOrder, ArrayList<Integer> inOrder)
 {
   for(int i=0; i < inOrder.size(); i++)
    map.putIfAbsent(inOrder.get(i) , i);
    
	return construct(0, inOrder.size()-1, preOrder);
   
 }
  
 TreeNode construct(int start, int end, ArrayList<Integer> preOrder)
 {
     
 if(start > end || pIndex == preOrder.size())
  return null;
  
 TreeNode root = new TreeNode(preOrder.get(pIndex++));

 int iIndex = map.get(root.val);


root.left  =construct( start , iIndex-1 , preOrder);
root.right =construct(iIndex + 1, end, preOrder);

return root;

}
 
}