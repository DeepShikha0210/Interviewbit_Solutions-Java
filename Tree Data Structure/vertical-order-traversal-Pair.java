package CreatingSolutions;

import java.util.*;

class Solution{
    class Pair {
        TreeNode root;
        int hd;

        public Pair(TreeNode root, int hd)
        {
            this.root =root;
            this.hd = hd;
        }
    }

    public ArrayList<ArrayList<Integer>>  verticalOrder(TreeNode root)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        int minHD= Integer.MIN_VALUE;
        int maxHD= Integer.MAX_VALUE;
        while(!q.isEmpty())
        {
            Pair current = q.poll();
            map.putIfAbsent(current.hd , new ArrayList<>());
            map.get(current.hd).add(current.root.val);
            minHD=Math.min(minHD, current.hd);
            maxHD=Math.max(maxHD, current.hd);

            if(current.root.left!=null)
                q.offer(new Pair(current.root.left, current.hd-1));

            if(current.root.right!=null)
                q.offer(new Pair(current.root.right, current.hd+1));
        }

        for(int i = minHD; i <= maxHD; i++)
        {
            result.add(map.get(i));
        }
        return  result;
    }
}