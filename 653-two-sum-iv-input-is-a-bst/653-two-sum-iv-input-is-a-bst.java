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
    
    Set<Integer> visited;
    public boolean findTarget(TreeNode root, int k) {
        visited = new HashSet<Integer>();
        return _find(root, k);
    }
    
    private boolean _find(TreeNode root, int k) {
        if(root == null) {
            return false;
        }
        if(visited.contains(k - root.val)) {
            return true;
        }
        visited.add(root.val);
        return _find(root.left, k) || _find(root.right, k);
    }
}