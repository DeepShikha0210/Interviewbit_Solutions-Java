package CreatingSolutions;
import java.util.*;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        //ArrayList<Integer> B = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(1);
        A.add(3);
        A.add(4);
        A.add(2);
        A.add(3);

        int B = 4;

        System.out.println(solve(A, B));
       //arr[] = {1, 2, 1, 3, 4, 2, 3};
        //       k = 4
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

        int n = A.size();
        if (B > n) {
            return new ArrayList<Integer>();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < B - 1; i++) {
            map.put(A.get(i), map.getOrDefault(A.get(i), 0) + 1);
        }
        ArrayList<Integer> output = new ArrayList<>();
        int start = 0;
        for (int i = B - 1; i < n; i++) {
            map.put(A.get(i), map.getOrDefault(A.get(i), 0) + 1);
            output.add(map.size());
            map.put(A.get(start), map.getOrDefault(A.get(start), 0) - 1);
            if (map.get(A.get(start)) <= 0) {
                map.remove(A.get(start));
            }
            start++;
        }
        return output;
    }
}

