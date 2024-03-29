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
    public int dfs(TreeNode root) {
        if (root == null)
            return 0;
        if (root.right == null)
            return 1 + dfs(root.left);
        if (root.left == null)
            return 1 + dfs(root.right);

        return 1 + Math.min(dfs(root.right), dfs(root.left));
    }
    public int minDepth(TreeNode root) {
        return dfs(root);
    }
}