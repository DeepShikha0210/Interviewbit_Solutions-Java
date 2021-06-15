public class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }

    @Override
    public String toString() {
        return "(" +
                 + start +
                ", " + end +
                ')';
    }
}
/************************************************************************************/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Interval> A = new ArrayList<>();
        A.add(new Interval(1, 3));
        A.add(new Interval(2, 6));
        A.add(new Interval(8, 10));
        A.add(new Interval(15, 18));
        //A.add(new Interval(2, 3));

        System.out.println(solve(A));
    }

    public static ArrayList<Interval> solve(ArrayList<Interval> intervals) {

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        int index=0;
        int i =1;

        while(i< intervals.size())
        {
          Interval current = intervals.get(i);
          Interval toCheck = intervals.get(index);

          if(current.start <= toCheck.end)  //overLapped
        {
            //System.out.println(i + " 1st");
            toCheck.start = Math.min(current.start, toCheck.start);
            toCheck.end= Math.max(current.end, toCheck.end);
            //System.out.println(intervals);
            intervals.remove(i);
        }

          else {  // not overlapped
              //System.out.println(i + " 2nd");
              index++;
              intervals.set(index, current);
              i++;

          }
        }
       return intervals;
    }
}