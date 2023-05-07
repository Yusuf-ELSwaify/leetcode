class Solution {
    public int removeDuplicates(int[] nums) {
        int compare = 1, i = 0;
        while (compare < nums.length && i <= compare)
            if (nums[i] == nums[compare])
                compare++;
            else
                nums[++i] = nums[compare];

        return i + 1;
    }
}