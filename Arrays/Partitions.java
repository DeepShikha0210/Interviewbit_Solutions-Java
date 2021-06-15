package CreatingSolutions;
import java.util.*;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        A.add(0);
        A.add(1);
        A.add(-1);
        A.add(0);
       
        int B =A.size();
        System.out.println(solve(A));
       
    }
	
    public static int solve(ArrayList<Integer> A) {
        int sum = 0;
        int prefixSum[] = new int[A.size()];

        for (int i = 0; i < A.size(); i++) 
			prefixSum[i] = sum;
     		sum += A.get(i);
        }
            if (sum % 3 != 0) {
                return 0;
		}
            int result = 0, count = 0;
            int oneThird = sum / 3;
            int twoThird = (2 * sum) / 3;

        for (int i = 1; i < A.size(); i++){
            if (prefixSum[i] == twoThird) {
                result += count;
                }
            if (prefixSum[i] == oneThird) {
                    count++;
            }
        }
        return result;
        }
    }


