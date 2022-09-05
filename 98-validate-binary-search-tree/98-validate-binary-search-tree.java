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

ArrayList<Integer> nums = new ArrayList<Integer>();

public boolean isValidBST(TreeNode root) {
    
    traverse(root);
    
    for(int i = 1;i < nums.size();i++) {
        if(nums.get(i) <= nums.get(i - 1)) {
            return false;
        }
    }
    
    return true;   
}

public void traverse(TreeNode node) {
    if(node  == null) { return; }
    traverse(node.left);
    nums.add(node.val);
    traverse(node.right);
}
}