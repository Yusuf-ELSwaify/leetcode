class Solution {
    public static String removeHashs(String s){
        StringBuilder ans = new StringBuilder(s.length());

        for (char c: s.toCharArray()) {
            if (c != '#')
                ans.append(c);
            else if (ans.length() > 0)
                ans.deleteCharAt(ans.length() - 1);
        }
        return ans.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        return removeHashs(s).equals(removeHashs(t));
    }
}