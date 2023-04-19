/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int longestZigZag(TreeNode root) {
        if (root == null)
            return -1;
        return Math.max(iterate(root.left, 1, false),
                                iterate(root.right, 1, true));
    }
    private int iterate(TreeNode root, int path, boolean isRight) {
        int leftPath, rightPath;

        if (root == null) 
            return path - 1;

        if (isRight) {
            leftPath = iterate(root.left, path + 1, false);
            rightPath = iterate(root.right, 1, true);
        } else {
            rightPath = iterate(root.right, path + 1, true);
            leftPath = iterate(root.left, 1, false);
        }

        return Math.max(Math.max(leftPath, rightPath), path);
    }

}