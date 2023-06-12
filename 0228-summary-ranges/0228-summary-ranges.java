class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> output = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++)
        {
            int start = nums[i];
            
            while (i < nums.length - 1 && nums[i] == nums[i + 1] - 1)
                i++;
            
            if (start == nums[i])
                output.add(String.valueOf(start));
            else
                output.add(start + "->" + nums[i]);
        }
        return output;
    }
}