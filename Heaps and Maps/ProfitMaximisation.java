package CreatingSolutions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        //ArrayList<Integer> B = new ArrayList<>();
        A.add(1);
        A.add(4);

        int k=2;
        System.out.println(solve(A , k));
    }

    public static int solve( ArrayList<Integer> A, int B) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        //PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.addAll(A);
        int sum = 0;
        while(B!=0 )
        {
            int p =maxHeap.poll();
            sum+=p;
            maxHeap.add(p-1);
            B--;
        }

        return sum;
    }
}

