package CreatingSolutions;
import java.util.*;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        A.add(1);
        A.add(4);
        A.add(2);
        A.add(3);
        B.add(2);
        B.add(5);
        B.add(1);
        B.add(6);

        System.out.println(solve(A , B));
    }

    public static ArrayList<Integer> solve( ArrayList<Integer> A, ArrayList<Integer> B) {


                ArrayList<Integer> result=new ArrayList<>();
                Collections.sort(A,Collections.reverseOrder());
                Collections.sort(B,Collections.reverseOrder());
                PriorityQueue<Integer> minHeap=new PriorityQueue<>();
                for(int a:A){
                    for(int b:B){
                        if(minHeap.size()<A.size())
                            minHeap.add(a+b);
                        else if(a+b>minHeap.peek())
                            minHeap.add(a+b);
                        else break;
                        if(minHeap.size()>A.size())
                            minHeap.poll();
                    }
                }
                while(minHeap.size()>0) result.add(0,minHeap.poll());
                return result;
            }
        }

