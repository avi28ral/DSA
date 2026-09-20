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
    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter ; 
    }
    private int height(TreeNode node){
        if(node == null){
            return -1;
        }
        int leftHeight = height(node.left);
        int rightHeight =height(node.right);

        int diameter = leftHeight + rightHeight;
        maxDiameter = Math.max(maxDiameter, diameter + 2);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}