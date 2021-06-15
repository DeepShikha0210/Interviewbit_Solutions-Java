public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int n = A.size();
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        for(int i=0; i<n-3; i++){
            int smallest = A.get(i);
            for(int j=i+1; j<n-2; j++){
                int smallest2 = A.get(j);
                int left = j+1;
                int right = n-1;
                int req_sum = B - smallest - smallest2;
                while(left < right){
                    // System.out.println(left + " " + right);
                    int sum = A.get(left) + A.get(right);
                    if(sum == req_sum){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(smallest);
                        temp.add(smallest2);
                        temp.add(A.get(left));
                        temp.add(A.get(right));
                        if(!answer.contains(temp)){
                            answer.add(temp);
                        }
                        left+=1;
                    }
                    else if(sum < req_sum){
                        left +=1;
                    }
                    else{
                        right-=1;
                    }
                }
                
            }
        }
        return answer;
    }
}