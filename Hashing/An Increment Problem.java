import java.util.ArrayList;

public class Solution

{
    public static void main(String[] args)

    {
        //6 -17 5 -16 -18 -17 2 -4 5 -13 -2 20
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(4);
        a.add(2);
        a.add(1);
        a.add(3);


        System.out.println(solve(a));

    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A)
    {

        ArrayList<Integer> output = new ArrayList<Integer>();

        for(int i=0; i< A.size(); i++)
        {
            if (output.contains(A.get(i)))
            {
                
                int index = output.indexOf(A.get(i));
                output.set(index, output.get(index) + 1);

            }
            output.add(A.get(i));
        }
        return output;
    }
}
