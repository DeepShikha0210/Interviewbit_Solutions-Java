public class Solution 
{
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int diffPossible(final List<Integer> A, int B) 
    {
    HashSet<Integer> set = new HashSet<>();
    
     for(int i=0;i<A.size();i++)
       {
          int c=A.get(i);
              
          if(set.contains(B+c) || set.contains(c-B))
               return 1;
          set.add(c);
        }
    return 0;
    }
}
