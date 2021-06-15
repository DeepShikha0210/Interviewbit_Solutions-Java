class Solution{
    
    HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();
public ArrayList<Integer> solve(TreeNode root)
{
   ArrayList<Integer> result = new ArrayList<>();
    preOrder(root, 1);
    for (int i = map.size(); i > 0; i--) {
        result.addAll(map.get(i));
        }

  return result;
  }
  
  void preOrder(TreeNode root , int level)
  {
      if(root == null)
      return;
      
      map.putIfAbsent(level, new ArrayList<>());
      map.get(level).add(root.val);
     
     preOrder(root.left, level+1);
     preOrder(root.right, level+1);
  }
  }
