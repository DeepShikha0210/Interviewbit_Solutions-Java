public class Solution {

public int solve(ArrayList<Integer> A, int B) {
    HashSet<Integer> set=new HashSet<>();
    int result=0;
    for(int i=0;i<A.size();i++){
        if(set.contains(B^A.get(i))){
            result++;
        }
        set.add(A.get(i));
    }
    return result;
}
}
