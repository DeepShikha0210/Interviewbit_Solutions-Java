public class Solution {
   
 public int maxSubArray(final int[] A) {
        
        int sum = 0 ;
        int GreatMax = Integer.MIN_VALUE;
      
        if(A.length==1) return A[0];


        for (int i =0; i < A.length; i++)
         {
            
              sum =  Math.max(A[i], sum+A[i]);
              if (GreatMax < sum) 
                GreatMax = sum;
                
         }
  
     
        return GreatMax;
      }
}

/*******************************************************************/

public class Solution {
  
    public int maxSubArray(final List<Integer> A) {
        int maxEndingHere = A.get(0);
        int maxSoFar = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            maxEndingHere = Math.max(A.get(i), A.get(i) + maxEndingHere);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}

/*******************************************************************************/