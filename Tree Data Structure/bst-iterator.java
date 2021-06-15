/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    
     public Stack<TreeNode> stack =new Stack<>();

    public Solution(TreeNode root) {
   
        while(root!=null)
        {
        stack.push(root);
        root=root.left;
        }
            
        }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        
        return !(stack.isEmpty());
        
    }

    /** @return the next smallest number */
    public int next() {
        
        TreeNode node = stack.pop();
        int val = node.val;
        node=node.right;
        
         while (node != null) {
            stack.push(node);
            node = node.left;
        }
        
        return val;
        
    }
}

/**
 * Your Solution will be called like this:
 * Solution i = new Solution(root);
 * while (i.hasNext()) System.out.print(i.next());
 */

//We could have also added all treeNOde values into an arrayList in inorder traversal path and then checked it.
//But it woud have increased space complexity by O(n)