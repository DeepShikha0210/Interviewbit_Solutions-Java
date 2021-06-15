public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        
        ArrayList<Integer> output = new ArrayList<Integer>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i< A.size(); i++)
        {
            for(int j = 0; j<A.get(0).size(); j++)
            {
                int element = A.get(i).get(j);
                minHeap.add(element);
                
            }
        }
        
        while(!minHeap.isEmpty())
            output.add(minHeap.poll());
            
        return output;
    }
}
