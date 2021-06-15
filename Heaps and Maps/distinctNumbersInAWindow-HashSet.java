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

        int N= A.size();
        ArrayList<Integer> output = new ArrayList<>();
        if(B>N)
            return output;
        HashSet<Integer> set = new HashSet<>();
        int i=0,j=0;
        while(i < N-B+1)
        {
            if(!set.contains(A.get(j)))
                set.add(A.get(j));

            if(j == i+B-1)
            {
              output.add(set.size());
              set.clear();
              i++;
              j=i;
            }
            else if(j< i+B-1)
                j++;
        }
        return output;
    }
}

/*********************************************************************************************/
