class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r = 0, c = 0, R = matrix.length - 1, C = matrix[0].length - 1, i;
        ArrayList<Integer> res = new ArrayList<>();

        while(r <= R && c <= C){
            for(i = c; i <= C && r <= R; i++) {
                res.add(matrix[r][i]);
            }
            r++;
            for(i = r; i <= R &&  c <= C; i++) {
                res.add(matrix[i][C]);
            }
            C--;
            for(i = C; i >= c &&  r<=R; i--) {
                res.add(matrix[R][i]);
            }
            R--;
            for(i = R; i >= r && c<=C; i--) {
                res.add(matrix[i][c]);
            }
            c++;
        }
        return res;
    }
}
