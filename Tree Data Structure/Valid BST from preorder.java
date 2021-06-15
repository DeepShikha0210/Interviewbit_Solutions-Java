class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
/******************************************************************************/
import java.util.*;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        A.add(40);
        A.add(30);
        A.add(35);
        A.add(80);
        A.add(100);
        //A.add(5);
        //A.add(2);
        //A.add(8);
//A = [7, 7, 10, 10, 9, 5, 2, 8]
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        Stack<Integer> s=new Stack<>();
        int root= Integer.MIN_VALUE;

        for(int i = 0; i< A.size(); i++){
             int a = A.get(i);
            //System.out.println("i: " + i);
            //System.out.println("a: " + a);
            if(a<root)
                return 0;

            while(!s.isEmpty() && s.peek()<a){
                root=s.peek();
               // System.out.println("root: " + root);
                int b = s.pop();
              //  System.out.println("b: " + b);
            }

            s.push(a);
            //System.out.println("pushed in stack: " + a);

        }
        return 1;

    }
}


