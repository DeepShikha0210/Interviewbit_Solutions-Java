/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) 
    {
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
         RandomListNode current = head;
         RandomListNode temp= null;
         
         while(current!=null)
         {
            map.put(current, new RandomListNode(current.label));
            current = current.next;
         }
        
        current = head;
        RandomListNode newHead;
        
        while(current!= null)
        {
           map.get(current).next = map.get(current.next);
           map.get(current).random = map.get(current.random);
           current = current.next;
           
        }
        current = head;
        return map.get(current);
    }
}
