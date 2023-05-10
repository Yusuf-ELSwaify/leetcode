class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int count = 1, r = 0, c = 0, R = n - 1, C = n - 1, i;

        while(r <= R && c <= C){
            for(i = c; i <= C && r <= R; i++) {
                res[r][i] = count++;
            }
            r++;
            for(i = r; i <= R &&  c <= C; i++) {
                res[i][C] = count++;
            }
            C--;
            for(i = C; i >= c &&  r<=R; i--) {
                res[R][i] = count++;
            }
            R--;
            for(i = R; i >= r && c<=C; i--) {
                res[i][c] = count++;
            }
            c++;
        }
        return res;
    }
}