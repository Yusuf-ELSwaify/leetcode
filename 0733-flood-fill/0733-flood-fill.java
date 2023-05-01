class Solution {
    public void flooding(int[][] image, int sr, int sc, int initColor, int color) {
        if (sr < 0 || sr >= image.length)
            return;
        if (sc < 0 || sc >= image[0].length)
            return;
        if (image[sr][sc] == color || image[sr][sc] != initColor)
            return;

        image[sr][sc] = color;

        flooding(image, sr + 1, sc, initColor, color);
        flooding(image, sr, sc + 1, initColor, color);
        flooding(image, sr - 1, sc, initColor, color);
        flooding(image, sr, sc - 1, initColor, color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        flooding(image, sr, sc, image[sr][sc], color);
        return image;
    }
}