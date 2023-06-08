class Solution {
    public int countNegatives(int[][] grid) {
        int columns = grid[0].length;
        int negativeCount = 0, postiveCountInRow = columns - 1;

        for (int[] row : grid) {
            while (postiveCountInRow >= 0 && row[postiveCountInRow] < 0)
                postiveCountInRow--;

            negativeCount += columns - (postiveCountInRow + 1);
        }
        return negativeCount;
    }
}