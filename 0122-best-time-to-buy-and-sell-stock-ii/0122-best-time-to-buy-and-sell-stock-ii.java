class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;

	    for (int i = 0; i < prices.length - 1; i++)
            sum += Math.max(prices[i], prices[i + 1]) - prices[i];

	    return sum;
    }
}


 