import java.util.*;

public class Solution {

    static int count = 0;
    static int result = 0;

    public static TreeNode insert(TreeNode root, int x) {
        if (root == null)
            return new TreeNode(x);
        if (x < root.val)
            root.left = insert(root.left, x);
        else if (x > root.val)
            root.right = insert(root.right, x);
        return root;
    }

       public static void main(String[] args) {

        TreeNode root = null;
        ArrayList<Integer> A = new ArrayList<>();
        A.add(20);
        A.add(8);
        A.add(22);
        A.add(4);
        A.add(12);
        A.add(10);
        A.add(14);

           for (int x : A)
               root = insert(root, x);

        int k = 3;
        System.out.println(solve(root, k));
        //System.out.println(solve(A));
    }

    public static int solve(TreeNode A, int B) {

        if(A==null)
            return 0;

        if (A.left != null)
            solve(A.left, B);
        count++;

        if (count == B)
            result= A.val;

        if (A.right != null)
            solve(A.right, B);

        return result;
    }
}
/************************************************************************************/
public class Solution {
    public int kthsmallest(TreeNode A, int k) {
        Stack<TreeNode> stack = new Stack<>();
        
        while(A != null) {
            stack.push(A);
            A = A.left;
        }
        
        while (k != 0) {
            TreeNode n = stack.pop();
            k--;
            if (k==0) return n.val;
            TreeNode right = n.right;
            
            while (right != null) {
                stack.push(right);
                right = right.left;
            }
        }
        
        return -1;
    }
}

