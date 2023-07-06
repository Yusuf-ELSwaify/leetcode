class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, right = 0, zeros = 0;
        int res = 0;

        while (right < nums.length) 
        {
            zeros += nums[right] == 0 ? 1 : 0;

            while (zeros > 1)
                zeros -= nums[left++] == 0 ? 1 : 0;

            res = Math.max(res, right - left);
            right++;
        }
        return res;
    }
}