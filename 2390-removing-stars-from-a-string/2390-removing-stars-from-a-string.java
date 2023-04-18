class Solution {
    public String removeStars(String s) {
        StringBuilder ans = new StringBuilder(s.length());
        int current = 0;

        for (char c: s.toCharArray()) {
            if (c != '*')
            {
                ans.append(c);
                current++;
            }
            else
                ans.deleteCharAt(--current);
        }
        return ans.toString();
    }
}