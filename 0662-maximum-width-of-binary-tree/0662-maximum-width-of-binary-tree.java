import java.util.LinkedList;
import java.util.Queue;
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
class TreeNodePos {
    TreeNode node;
    int idx;
    public TreeNodePos(TreeNode node, int idx){
        this.node = node;
        this.idx = idx;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int maxWidth = 1;
        Queue<TreeNodePos> queue = new LinkedList<>();

        queue.add(new TreeNodePos(root, maxWidth));
        while (!queue.isEmpty()){
            int size = queue.size(), leftIdx = 0, rightIdx = 0;

            for (int i = 0; i < size; i++)
            {
                TreeNodePos cur = queue.remove();
                if (i == 0)
                    leftIdx = cur.idx;
                if(i == size - 1)
                    rightIdx = cur.idx;
                    
                if(cur.node.left!=null)
                    queue.add(new TreeNodePos(cur.node.left, 2 * cur.idx));
                if(cur.node.right!=null)
                    queue.add(new TreeNodePos(cur.node.right, 2 * cur.idx + 1));                    
            }
            maxWidth = Math.max(maxWidth, (rightIdx - leftIdx + 1));
        }
        return maxWidth;
    }
}