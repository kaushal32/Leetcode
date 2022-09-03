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
    public int maxDepth(TreeNode root) {
        int ht = 0;
        if(root == null) {
            return 0;
        }
        if(root.left != null) {
            int cHeight = maxDepth(root.left);
            ht = Math.max(ht, cHeight);
        }
        if(root.right != null) {
            int cHeight = maxDepth(root.right);
            ht = Math.max(ht, cHeight);
        }
        ht = ht + 1;
        return ht;
    }
}