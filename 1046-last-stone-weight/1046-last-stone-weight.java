class Solution {
    public int lastStoneWeight(int[] stones) {
        for (int i = stones.length - 1; i > 0 ; i--){
            Arrays.sort(stones);
            stones[i - 1] = stones[i] - stones[i - 1];
        }
        return stones[0];
    }
}