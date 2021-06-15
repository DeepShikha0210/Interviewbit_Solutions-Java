package CreatingSolutions;
import java.util.*;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Integer> B = new ArrayList<>();
        B.add(6);
        B.add(5);
        int A=3;
        System.out.println(solve(A , B));
    }

    public static int solve( int A, ArrayList<Integer> B) {
        int mod = 1000000007;
        //Return your answer modulo 10^9+7

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(B);

        int chocolatesEaten = 0;
        while(A > 0)
        {
            int p = maxHeap.poll();
            chocolatesEaten = (chocolatesEaten%mod + p%mod)%mod;   ////Return your answer modulo 10^9+7
            maxHeap.add((int)Math.floor(p/2));
            A--;
        }
        return (int)chocolatesEaten%mod; ///Return your answer modulo 10^9+7
    }
}

/**************************************************************************************************/

public static int solve( int A, ArrayList<Integer> B) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(B);

        int chocolatesEaten = 0;
        while(A > 0)
        {
            int p = maxHeap.poll();
            chocolatesEaten += p;
            maxHeap.add((int)Math.floor(p/2));
            A--;
        }

        return chocolatesEaten;
    }