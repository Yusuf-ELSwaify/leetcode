class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> twoLists = new LinkedList<>();
        LinkedList<Integer> diff1 = new LinkedList<>();
        LinkedList<Integer> diff2 = new LinkedList<>();
        boolean[] freq1 = new boolean[2001];
        boolean[] freq2 = new boolean[2001];

        twoLists.add(diff1);
        twoLists.add(diff2);

        for (int n : nums1)
            freq1[n + 1000] = true;

        for (int n : nums2){
            freq2[n + 1000] = true;
            if (!freq1[n + 1000]){
            	diff2.add(n);
                freq1[n + 1000] = true;
            }
        }
        for (int n : nums1)
            if (!freq2[n + 1000]){
            	diff1.add(n);
                freq2[n + 1000] = true;
            }

        return twoLists;
    }
}