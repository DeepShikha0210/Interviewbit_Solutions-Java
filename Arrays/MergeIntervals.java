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
        A.add(new Interval(3, 6));
        A.add(new Interval(8, 10));
        //A.add(new Interval(2, 3));
        //A.add(new Interval(2, 3));
        //A.add(new Interval(2, 3));

        System.out.println(solve(A, new Interval(1, 2)));
    }

    public static ArrayList<Interval> solve(ArrayList<Interval> intervals, Interval newInterval) {

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start- o2.start ;
            }
        });

        ArrayList<Interval> output= new ArrayList<Interval>();

        Interval toInsert = newInterval;
        for(int i = 0; i < intervals.size(); i++)
        {
            Interval interval = intervals.get(i);

            if(toInsert.end < interval.start)
            {
               // System.out.println(i + " 1st");
                output.add(toInsert);
                output.addAll(intervals.subList(i , intervals.size()));
                return output;
            }
            else if(toInsert.start > interval.end) {
                //System.out.println(i + " 2nd");
                output.add(interval);
            }
            else  {
                    toInsert.start = Math.min(interval.start, toInsert.start);
                    toInsert.end = Math.max(interval.end, toInsert.end);
                    //System.out.println(i + " 3rd");
            }

            //System.out.println(i);
        }
        output.add(toInsert);
        return output;
    }
}