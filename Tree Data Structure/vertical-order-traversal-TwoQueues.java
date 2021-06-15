public class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(A == null) return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        Queue<Integer> verticalLevel = new LinkedList<Integer>();
        
        queue.offer(A);
        verticalLevel.offer(0);
        Integer minLevel=Integer.MIN_VALUE;
        Integer maxLevel=Integer.MAX_VALUE;
        
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            Integer level = verticalLevel.poll();
            minLevel = Math.min(level, minLevel);
            maxLevel = Math.max(level, maxLevel);
          
            map.putIfAbsent(level,  new ArrayList<Integer>());
            map.get(level).add(node.val);
            if(node.left != null) {
                queue.offer(node.left);
                verticalLevel.offer(level - 1);
            }
            if(node.right != null) {
                queue.offer(node.right);
                verticalLevel.offer(level + 1);
            }
        }
        
        for(int level = minLevel; level <= maxLevel; ++level){
            
                result.add(map.get(level));
            }
        
        
        return result;
    }
}

/*****************************************************************************************************
The idea is to traverse the tree once and get the minimum and maximum horizontal distance with respect to root. For the tree shown above, minimum distance is -2 (for node with value 2) and maximum distance is 2 (For node with value 9).
Once we have maximum and minimum distances from root, we iterate for each vertical line at distance minimum to maximum from root, and for each vertical line traverse the tree and print the nodes which lie on that vertical line.

Time Complexity: Time complexity of above algorithm is O(w*n) where w is width of Binary Tree and n is number of nodes in Binary Tree. In worst case, the value of w can be O(n) (consider a complete tree for example) and time complexity can become O(n^2).

This problem can be solved more efficiently


We have discussed a O(n^2) solution in the previous hint. An efficient solution based on hash map is discussed.
 We need to check the Horizontal Distances from root for all nodes. If two nodes have the same Horizontal Distance 
 (HD), then they are on same vertical line. The idea of HD is simple. HD for root is 0, a right edge 
 (edge connecting to right subtree) is considered as +1 horizontal distance and a left edge is considered 
 as -1 horizontal distance. For example, in the above tree, HD for Node 2 is at -2, HD for Node 3 is -1, HD 
 for 5 is 0, HD for node 7 is +1 and for node 9 is +2.
We can do level order traversal of the given Binary Tree. While traversing the tree, we can maintain HDs. 
We initially pass the horizontal distance as 0 for root. For left subtree, we pass the Horizontal Distance 
as Horizontal distance of root minus 1. For right subtree, we pass the Horizontal Distance as Horizontal 
Distance of root plus 1. For every HD value, we maintain a list of nodes in a hasp map. Whenever we see a 
node in traversal, we go to the hash map entry and add the node to the hash map using HD as a key in map.

Time Complexity of hashing based solution can be considered as O(n) under the assumption that we have 
good hashing function that allows insertion and retrieval operations in O(1) time. 
In the above C++ implementation, map of STL is used. map in STL is typically implemented using 
a Self-Balancing Binary Search Tree where all operations take O(Logn) time. Therefore time complexity 
of above implementation is O(nLogn).

*****************************************************************************************************/

