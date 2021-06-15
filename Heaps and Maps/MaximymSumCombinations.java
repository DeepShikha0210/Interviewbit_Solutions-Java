public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        
                ArrayList<Integer> result=new ArrayList<>();
                Collections.sort(A,Collections.reverseOrder());
                Collections.sort(B,Collections.reverseOrder());
                PriorityQueue<Integer> minHeap=new PriorityQueue<>();
                for(int a:A){
                    for(int b:B){
                        if(minHeap.size()<C)
                            minHeap.add(a+b);
                        else if(a+b>minHeap.peek())
                            minHeap.add(a+b);
                        else break;
                        if(minHeap.size()>C)
                            minHeap.poll();
                    }
                }
                while(minHeap.size()>0) result.add(0,minHeap.poll());
                return result;
    }
}