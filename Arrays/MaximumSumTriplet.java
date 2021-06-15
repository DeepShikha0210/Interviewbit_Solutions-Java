import java.util.ArrayList;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
      
        A.add(2);
        A.add(5);
        A.add(3);
        A.add(1);
        A.add(4);
        A.add(9);
        
    }

    public static int solve(ArrayList<Integer> A) {

        int[] maxLeft = new int[A.size()];
        int max = Integer.MIN_VALUE;

        for (int i = A.size()-1; i >= 0; i--) { //Max Suffix Array
            max = Math.max(max, A.get(i));
            maxLeft[i] = max;

        }

        TreeSet<Integer> set = new TreeSet<>();  // TreeSet.lower() functions returns greatest   
        set.add(Integer.MIN_VALUE);              //of the rest but lower than the current given value;
        int result = 0;
        
        for (int i = 0; i < A.size() - 1; i++) {
            if (A.get(i) < maxLeft[i + 1]) {
                result = Math.max(result, set.lower(A.get(i)) + A.get(i) + maxLeft[i + 1]);
                set.add(A.get(i));
            }
        }
     return result;
    }
}