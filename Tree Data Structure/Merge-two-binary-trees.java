public class Solution {
    public TreeNode solve(TreeNode A, TreeNode B) {
        
        if(A ==null)
        return B;
        
        if(B== null)
        return A;
        
        A.val+=B.val;
        A.left = solve(A.left, B.left);
        A.right=solve(A.right, B.right);
        
        return A;
    }
}



/* Recursive Algorithm:

Traverse the tree in Preorder fashion
Check if both the tree nodes are NULL
If not, then update the value
Recur for left subtrees
Recur for right subtrees
Return root of updated Tree
Complexity Analysis:
Time complexity : O(n)
A total of n nodes need to be traversed. Here, n represents the minimum number of nodes from the two given trees.
Auxiliary Space : O(n)
The depth of the recursion tree can go upto n in case of a skewed tree. In average case, depth will be O(logn).

Iterative Algorithm:

Create a stack
Push the root nodes of both the trees onto the stack.
While the stack is not empty, perform following steps :
Pop a node pair from the top of the stack
For every node pair removed, add the values corresponding to the two nodes and update the value of the corresponding node in the first tree
If the left child of the first tree exists, push the left child(pair) of both the trees onto the stack.
If the left child of the first tree doesn’t exist, append the left child of the second tree to the current node of the first tree
Do same for right child pair as well.
If both the current nodes are NULL, continue with popping the next nodes from the stack.
Return root of updated Tree
Complexity Analysis:

Time complexity : O(n)
A total of n nodes need to be traversed. Here, n represents the minimum number of nodes from the two given trees.
Auxiliary Space : O(n)
The depth of the stack can go upto n in case of a skewed tree */