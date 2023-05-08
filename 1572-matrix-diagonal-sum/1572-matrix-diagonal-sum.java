class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length, res = 0;

        for (int i = 0; i < n; i++){
            res += mat[i][i];
            res += mat[i][n - 1 - i];
        }
        if ((n & 1) != 0)// if n is odd
            res -= mat[n/2][n/2];
        return res;
    }
}