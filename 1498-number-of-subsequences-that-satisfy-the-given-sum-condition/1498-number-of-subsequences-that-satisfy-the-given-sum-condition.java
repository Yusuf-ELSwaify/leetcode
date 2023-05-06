class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length, MOD = 1000000007;
        int[] dp = new int[n];
        dp[0] = 1; 
        for (int i = 1; i < n; i++)
            dp[i] = (dp[i-1] * 2) % MOD;
        
        int l = 0, r = n - 1;
        int res = 0;
        while (l <= r) {
            if (nums[l] + nums[r] <= target) {
                res += dp[r - l];
                if (res >= MOD)
                    res -= MOD;
                l++;
            } 
            else 
                r--;
        }
        return res;
    }
}
