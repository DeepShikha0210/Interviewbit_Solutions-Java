public class Solution {
    Set<Integer> set = new HashSet<>();
    public int t2Sum(TreeNode A, int B) {
        if (A == null) return 0;
        if (set.contains(B-A.val)) {
            return 1;
        }
        
        set.add(A.val);
        
        return Math.max(t2Sum(A.left, B), t2Sum(A.right, B));
    }
}

/******************************************************************************************/

public class Solution {
        public int t2Sum(TreeNode A, int B) {
        ArrayList<Integer> C=new ArrayList<Integer>();
        inorder(A,C);
        for(int i=0;i<C.size();i++)
        {
            if(C.contains(B-C.get(i)) && C.indexOf(B-C.get(i))!=i)
            return 1;
        }
        return 0;
    }
    public void inorder(TreeNode A,ArrayList<Integer> C)
    {
        if(A==null)
        return ;
        else
        {
            inorder(A.left,C);
            C.add(A.val);
            inorder(A.right,C);
        }
    }
    
}
