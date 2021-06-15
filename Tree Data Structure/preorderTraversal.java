public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        
        ArrayList<Integer> output = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        
        stack.push(A);
     
       
        while(!stack.isEmpty())
        {    
            TreeNode current = stack.pop();
            output.add(current.val);
            
            
            if(current.right!=null)
            stack.push(current.right);
            
            if(current.left !=null)
            stack.push(current.left);
             
        }
    return output;    
    }
}