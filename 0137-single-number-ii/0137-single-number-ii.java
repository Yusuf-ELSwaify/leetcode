class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;

        for (int num : nums) {
            ones = (~twos) & (ones ^ num);
            twos = (~ones) & (twos ^ num);
        }
        return ones;
    }
}