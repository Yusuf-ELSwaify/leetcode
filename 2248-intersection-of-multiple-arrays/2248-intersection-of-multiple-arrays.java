class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new LinkedList<>();
        int[] freq = new int[1000];

        for (int[] numArray : nums)
            for (int num : numArray)
                ++freq[num - 1];

        for(int i = 0; i < 1000; i++)
            if (freq[i]  == nums.length)
                list.add(i + 1);

        return list;
    }
}