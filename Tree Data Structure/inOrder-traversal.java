public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        
        ArrayList<Integer> inorder = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode current = A;
   
        while(!stack.isEmpty() || current!= null)
        {
            if(current != null)
            {
                stack.push(current);
                current=current.left;
            }
            
            else
            {
               current = stack.pop();
               inorder.add(current.val);
               current= current.right;
            }
        }
        
        
        return inorder;
    }
}

/************************************************************************/
public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode a) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(a != null || !stack.isEmpty()) {
            while(a != null) {
                stack.push(a);
                a = a.left;
            }
            if(a == null && !stack.isEmpty()) {
                a = stack.pop();
                list.add(a.val);
                a = a.right;
            }
        }
        return list;
    }
}
