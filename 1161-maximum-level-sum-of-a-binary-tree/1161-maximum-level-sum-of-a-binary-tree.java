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
    ArrayList<Integer> levelsSum = new ArrayList<>();
    public void maxLevelSum(TreeNode node, int level) {
        if (node == null)
            return;
        while (levelsSum.size() <= level) {
            levelsSum.add(0);
        }
        int sum = levelsSum.get(level) + node.val;
        levelsSum.set(level, sum);
        maxLevelSum(node.left, level + 1);
        maxLevelSum(node.right, level + 1);
    }
    public int maxLevelSum(TreeNode root) {
        maxLevelSum(root, 0);
        int max = Integer.MIN_VALUE, maxLevel = 0;
        for (int i = 0; i < levelsSum.size(); i++)
        {
            if (levelsSum.get(i) > max) {
                max = levelsSum.get(i);
                maxLevel = i;
            }
        }
        return maxLevel + 1;
    }
}