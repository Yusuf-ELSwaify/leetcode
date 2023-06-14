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
    int minDifference = Integer.MAX_VALUE;
    int prev = -100001;

    void inorderTraversal(TreeNode node) {
        if (node == null)
            return;
        inorderTraversal(node.left);
        minDifference = Math.min(minDifference, node.val - prev);
        prev = node.val;
        inorderTraversal(node.right);
    }
    
    public int getMinimumDifference(TreeNode root) {
        inorderTraversal(root);
        return minDifference;
    }
}