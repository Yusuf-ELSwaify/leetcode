class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int max = Arrays.stream(candies).max().orElse(0);
    	
    	for (int count : candies)
    		if (count + extraCandies >= max)
    			result.add(true);
    		else
    			result.add(false);

    	return result;
    }
}