public class Solution {
    public ArrayList<Integer> solve(TreeNode A) {
        LinkedList<Integer> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);

        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.remove();
                //result.add(0, node.val);
                result.addFirst(node.val);
                if (node.right != null) queue.add(node.right);
                if (node.left != null) queue.add(node.left);
            }
        }
        return new ArrayList(result);
    }
}
