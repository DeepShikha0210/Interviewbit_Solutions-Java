public class Solution
{
    public int solve(String A) 
    { 
        int count=0;
        
       HashMap<Character , Integer> map = new HashMap<>();
       
       for(char c : A.toCharArray())
       {
           
           map.put(c, map.getOrDefault(c , 0)+1);
       }
       
       
       for (Character c : map.keySet()) 
       {
           if(map.get(c)%2 !=0)
           count++;
        
       }
       return count > 1 ? 0 : 1 ;
    }
} 