class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x = coordinates[0][0], y = coordinates[0][1];
        //int m = (y - coordinates[1][1]) / (x - coordinates[1][0]);
        int  my = (y - coordinates[1][1]), mx = (x - coordinates[1][0]);

        for (int[] coordinate : coordinates) {
            if (my * (x - coordinate[0]) !=  mx * (y - coordinate[1]))
                return false;
        }
        return true;
    }
}