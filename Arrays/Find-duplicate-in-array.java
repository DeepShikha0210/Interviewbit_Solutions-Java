public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] A) {
        
        for(int i =0; i< A.length; i++)
        {
            if((A[Math.abs(A[i])])<0)
            return Math.abs(A[i]);
            
            else
            {
                A[Math.abs(A[i])]= - (A[(Math.abs(A[i]))]);
            }
            
            
        }
        return -1;
    }
}
