/*For a BST, all values lower than the root go in the left part of root, and all values higher go in the right part
 of the root.
For the tree to be balanced, we will need to make sure we distribute the elements almost equally in left and right 
part.
So we choose the mid part of the array as root and divide the elements around it .

Things to take care of :
1) Are you passing a copy of the array around or are you only passing around a reference ?
2) Are you dividing the array before passing onto the next function call or are you just specifying the start and 
end index ?*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public TreeNode sortedArrayToBST(final int[] A){
        TreeNode root = new TreeNode(-1);
        return solve(root, A, 0, A.length - 1);
    }
    private TreeNode solve(TreeNode root, int[] arr, int low, int high){
        if(low > high){
            return null;
        }
        int mid = low + (high - low)/2;
        root = new TreeNode(arr[mid]);
        
        root.left = solve(root, arr, low, mid-1);
        root.right = solve(root, arr, mid+1, high);
        
        return root;
    }
    
}

/************************************************************************/
class Solution{

TreeNode sortedArrayToBST(ArrayList<Integer> A)
{
return construct(0, A.size()-1 , A);
}

TreeNode construct(int start, int end , ArrayList<> A)
{
 
 if(start> end)
 return null;
 
 int rootIndex = start + end-start/2;
 
 TreeNode root = new TreeNode(A.get(rootIndex));
 
 root.left= construct(start , rootIndex-1; A);
 root.right = construct(start , rootIndex+1, A);
 return root; 

}
}

/***************************************************************************/