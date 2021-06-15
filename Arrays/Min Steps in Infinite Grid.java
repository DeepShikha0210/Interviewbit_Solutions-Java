public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        int size = A.size();
        int shortestDistance=0, steps=0;
        
        
        for(int i =1; i < size; i++)
        {
            int dx = Math.abs(A.get(i)- A.get(i-1));
            int dy = Math.abs(B.get(i)- B.get(i-1));
            shortestDistance = Math.max(dx, dy);
            steps+=shortestDistance;
            
        }
        return steps;
    }
}
