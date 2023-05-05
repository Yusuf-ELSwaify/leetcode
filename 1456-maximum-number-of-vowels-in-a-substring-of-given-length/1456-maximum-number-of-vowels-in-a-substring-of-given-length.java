import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowelsSet = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u'));
      	int len = s.length(), vowelsCount = 0, ans;
      	char[] chars = s.toCharArray();

       	for (int i = 0; i < k; i++)
            if (vowelsSet.contains(chars[i]))
                ++vowelsCount;
      	ans = vowelsCount;

      	for (int i = k; i < len; i++)
      	{
 		    if (vowelsSet.contains(chars[i]))
	 			++vowelsCount;
		 	if (vowelsSet.contains(chars[i - k]))
                --vowelsCount;
      		ans = Math.max(ans, vowelsCount);
      	}
      	return ans;
    }
}