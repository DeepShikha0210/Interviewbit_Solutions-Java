public class Solution {
ArrayList<Integer> list = new ArrayList<>();

public ArrayList solve(TreeNode root) {
utils(root);
return list;
}
public void utils(TreeNode root){
Queue<TreeNode> q = new LinkedList<>();
q.offer(root);
while(!q.isEmpty()){
       TreeNode currNode = q.poll();
         while(currNode!=null){
            list.add(currNode.val);
            if(currNode.left!=null){
               q.offer(currNode.left);
              }
           currNode = currNode.right;
            }
        }
    }

}