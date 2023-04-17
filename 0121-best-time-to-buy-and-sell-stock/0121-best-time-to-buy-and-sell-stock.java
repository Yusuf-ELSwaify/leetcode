class Solution {
    public int maxProfit(int[] prices) {
		int max = 0, min = Integer.MAX_VALUE;

	    for (int index = 0; index < prices.length; index++)
        {
            min = Math.min(prices[index], min);
	    	if(min != prices[index])
	    		max = Math.max(prices[index] - min, max);
        }
	    return max;
    }
}