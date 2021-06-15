/*Inorder traversal : (Left tree) root (Right tree)

Note that the root is the max element in the whole array. Based on the info,
 can you figure out the position of the root in inorder traversal ? If so, 
 can you separate out the elements which go in the left subtree and right subtree ?
Once you have the inorder traversal for left subtree, you can recursively solve for left subtree. 
Same for right subtree.*/

class Solution{

TreeNode buildTree(ArrayList<Integer> A)
{
    return constructInorder(A, 0, A.size()-1);
}


TreeNode constructInorder(ArrayList<Integer> A, int start, int end)

{
   if(start > end)
   return null;
   
   int index = findMaxIndex(start , end , A);
   
   TreeNode root = new TreeNode(A.get(index));
   
   root.left = constructInorder(A, start, index-1);
   root.right = constructInorder(A, index+1, end);
   
   return root;
   
}

int findMaxIndex(int start, int end, ArrayList<Integer> A)
{
 int max = Integer.MIN_VALUE;
        int idx = -1;
        for (int i=start; i<=end; i++) {
            if(max < A.get(i)) {
                max = A.get(i);
                idx = i;
            }
        }
        
        return idx;
}
}