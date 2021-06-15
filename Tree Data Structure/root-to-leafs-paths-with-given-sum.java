public class Solution {
    private ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
    
    public void pathSumInner(TreeNode root, int sum, Stack<Integer>path) {
        path.push(root.val);
        
        if(root.left == null && root.right == null) {
            if(sum == root.val) resultList.add(new ArrayList<Integer>(path));
        }
        
        if(root.left!=null) pathSumInner(root.left, sum-root.val, path);
        if(root.right!=null)pathSumInner(root.right, sum-root.val, path);
        
        path.pop();
    }
    
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null) return resultList;
        Stack<Integer> path = new Stack<Integer>();
        pathSumInner(root, sum, path);
        return resultList;
    }
}
/***********************************************************************************************/

public class Solution {
ArrayList<ArrayList> output = new ArrayList<ArrayList>();

    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        
        ArrayList<Integer> temp = new ArrayList<Integer>(); 
        
        if(A == null) return output; 

        helper(A,0,B,temp); 
        return output; 
    }
    
    public void helper(TreeNode A, int sum, int B, ArrayList<Integer> temp){
        
        sum += A.val; 
        temp.add(A.val); 
        
        if(A.left == null && A.right == null){
            if(sum == B) output.add(temp);
        }
        
     if(A.left != null) helper(A.left, sum, B, new ArrayList<Integer>(temp));
     if(A.right != null) helper(A.right, sum, B, new ArrayList<Integer>(temp));

        }
}