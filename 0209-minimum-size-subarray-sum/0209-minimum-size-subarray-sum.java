class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0,  right = 0,  sum = 0,  len = Integer.MAX_VALUE;
        
        while (right < nums.length) {
            sum += nums[right++];
            
            while (sum >= target) {
                len = Math.min(len, right - left);
                sum -= nums[left++];
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}