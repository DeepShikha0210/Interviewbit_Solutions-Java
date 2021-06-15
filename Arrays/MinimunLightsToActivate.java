import java.util.*;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        //A.add(0);
        //A.add(0);
        A.add(1);
        A.add(0);
        A.add(1);
        A.add(0);
        A.add(0);
        A.add(0);
        int B= 4;


        System.out.println(minimumLights(A, B));
    }

    public static int minimumLights(ArrayList<Integer> A, int B) {

        boolean bulbFound = false;
        int bulbFoundAt= 0;
        int count =0;
        int i=0;

        while(i < A.size())
        {
            int inBack = i-B+1;
            int inFront = i+B-1;
            bulbFound=false;
            while(inBack < 0)
                inBack++;

            while(inFront>=A.size())
                inFront--;

            while(inFront >= inBack)
            {
                if(A.get(inFront)==1) {
                    bulbFound = true;
                    bulbFoundAt = inFront;
                    System.out.println("Bulb Found at " + bulbFoundAt); //Remove while running in Interviewbit
                    i = bulbFoundAt+ B-1 + 1;
                    count++;
                    break;
                }
                inFront--;
            }


            if(!bulbFound)
                return -1;
        }
        return count;


    }
}