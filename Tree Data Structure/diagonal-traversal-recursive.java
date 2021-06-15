public class Solution {

Map<Integer,ArrayList<Integer> > map = new TreeMap<>();

public void slope(TreeNode A , int d){
    if(A == null){
        return;
    }
    if(map.get(d) == null){
        map.put(d, new ArrayList<>());
    }
   
    slope(A.right,d);
    slope(A.left,d+1);
    map.get(d).add(A.val);
    
}
public ArrayList<Integer> solve(TreeNode A) {
    slope(A,0);
   ArrayList<Integer> output = new ArrayList<Integer>();
    for(Integer x : map.keySet()){
       List<Integer> ll = map.get(x);
       Collections.reverse(ll);
       for(Integer val : ll){
           output.add(val); 
    
    
    
}
}
return output;
}
}