public class Solution {
    public int colorful(int A) {
        
         HashSet<Integer> check = new HashSet<Integer>();
        String str = Integer.toString(A);
        for(int i=0;i<str.length();i++){
            int product = 1;
            for(int j=i; j<str.length();j++){
                int num = str.charAt(j) - '0';
                product *= num;
                if(check.contains(product)) return 0;
                check.add(product);
            }
        }
        return 1;
    }
}