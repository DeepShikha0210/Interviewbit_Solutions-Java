public class Solution {
    public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for (int i = 0; i < a.size(); i++){
            int curr = a.get(i);
            
            if (map.containsKey(b-curr)){
                int index = map.get(b-curr);
                ans.add(index);
                ans.add(i + 1);
                return ans;
            }else if (!map.containsKey(curr)){
                map.put(curr, i + 1);
            }
        }
        
        return ans;
    }
}