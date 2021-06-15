public class Solution 
{
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> a) 
    {
        if(a == null || a.size()<2)
        return a;
 
    int p=0;            
    for(int i=a.size()-2; i>=0; i--){
        if(a.get(i)<a.get(i+1)){
            p=i;
            break;
        }    
    }
 
    int q = 0;
    for(int i=a.size()-1; i>p; i--){
        if(a.get(i)> a.get(p)){
            q=i;
            break;
        }    
    }
 
    if(p==0 && q==0){
        reverse(a, 0, a.size()-1);
        return a;
    }
 
    int temp=a.get(p);
    a.set(p,a.get(q));
    a.set(q,temp);
 
    if(p<a.size()-1){
        reverse(a, p+1, a.size()-1);
        
      
    }
      return a;
}
 
public void reverse(ArrayList<Integer> a, int left, int right){
    while(left<right){
        int temp = a.get(left);
        a.set(left,a.get(right));
        a.set(right,temp);
        left++;
        right--;
    }
}
}