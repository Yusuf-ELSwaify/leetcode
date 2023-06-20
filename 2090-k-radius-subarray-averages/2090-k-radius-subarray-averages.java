class Solution {
    public int[] getAverages(int[] nums, int k) {
        if (k == 0)
            return nums;

        int n = nums.length, k_radius = k * 2 + 1;
        int[] result = new int[n];
        
        Arrays.fill(result, -1);
        if (k_radius > n)
            return result;

        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; i++)
            prefixSum[i + 1] = prefixSum[i] + nums[i];

        for (int i = k; i < n - k; i++)
            result[i] = (int)((prefixSum[i + k + 1] - prefixSum[i - k]) / k_radius);

        return result;
    }
}