class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new LinkedList<>();
        int[] freq = new int[1001];

        for (int[] numArray : nums)
            for (int num : numArray)
                ++freq[num];

        for(int i = 1; i <= 1000; i++)
            if (freq[i]  == nums.length)
                list.add(i);

        return list;
    }
}