class Solution {
    public int equalPairs(int[][] grid) {
        Trie trie = new Trie();
        int pairCount = 0, n = grid.length;
        
        for (int[] row : grid)
            trie.insert(row);
        
        for (int col = 0; col < n; ++col) {
            int[] colArray = new int[n];

            for (int row = 0; row < n; ++row)
                colArray[row] = grid[row][col];

            pairCount += trie.search(colArray);
        }
        return pairCount;
    }
}

class TrieNode {
    int count = 0;
    Map<Integer, TrieNode> children = new HashMap<>();
}

class Trie {
    TrieNode trie = new TrieNode();

    public void insert(int[] array) {
        TrieNode myTrie = this.trie;

        for (int a : array) {
            if (!myTrie.children.containsKey(a)) 
                myTrie.children.put(a, new TrieNode());
            
            myTrie = myTrie.children.get(a);
        }
        myTrie.count += 1;
    }

    public int search(int[] array) {
        TrieNode myTrie = this.trie;

        for (int a : array)
            if (myTrie.children.containsKey(a)) 
                myTrie = myTrie.children.get(a);
            else
                return 0;

        return myTrie.count;
    }
}
