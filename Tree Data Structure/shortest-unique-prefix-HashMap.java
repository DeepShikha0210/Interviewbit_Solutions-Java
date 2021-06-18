public class Solution {
public ArrayList prefix(ArrayList A) {
HashMap<String, Integer> hash = new HashMap<>();
ArrayList res = new ArrayList<>();

    for(String s:A){
        int len = s.length();
        for(int i=1; i<= len; i++){
            String ss = s.substring(0,i);
            if(hash.containsKey(ss)) {
                hash.put(ss, hash.get(ss)+1);
            } else {
                hash.put(ss, 1);
            }
        }
    }
    
    for(String s:A) {
        int len = s.length();
        for(int i=1; i<= len; i++){
            String ss = s.substring(0,i);
            if(hash.get(ss) == 1) {
                res.add(ss);
                break;
            }
            
        }
    }
    return res;
}
}