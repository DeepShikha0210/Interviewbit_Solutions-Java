public class Solution {
    class Trie {
    
        class TrieNode {
            private TrieNode[] children = new TrieNode[26];
            private boolean isWord = false;
            int freq = 0;
        }
        
        private TrieNode root;
    
        /** Initialize your data structure here. */
        public Trie() {
            root = new TrieNode();
        }
        
        public void insert(String word) {
            TrieNode current = root;
            char[] w = word.toCharArray();
            for(char ch : w) {
                int index = ch - 'a';
                if(current.children[index] == null) {
                    TrieNode newNode = new TrieNode();
                    current.children[index] = newNode;
                }
                current.children[index].freq++;
                current = current.children[index];
            }
            
            current.isWord = true;
        }
        
        public String getPrefix(String word) {
            TrieNode current = root;
            StringBuilder res = new StringBuilder();
            char[] w = word.toCharArray();
            boolean isFound = false;
            for(char ch : w) {
                int index = ch - 'a';
                res.append(ch);
                if(current.children[idx].freq == 1) {
                    isFound = true;
                    break;
                }
                current = current.children[index];
            }
            
            if(isFound) {
                return res.toString();
            }
            else {
                return "";
            }
        }
    }
    
    
    public ArrayList<String> prefix(ArrayList<String> A) {
        Trie trie = new Trie();
        for(String word : A) {
            trie.insert(word);
        }
        
        ArrayList<String> result = new ArrayList<>();
        for(String word : A) {
            result.add(tr.getPrefix(word));
        }
        return result;
    }
}