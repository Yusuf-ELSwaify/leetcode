class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        StringBuilder ans = new StringBuilder(n + m);
        
        for (int i = 0; i < n || i < m; i++){
            if (i < n) ans.append(word1.charAt(i));
            if (i < m) ans.append(word2.charAt(i));
        }
        return ans.toString();
    }
}