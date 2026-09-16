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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode X = findNode(root, x);
        TreeNode Y = findNode(root, y);
        
        return level(root, X, 0) == level(root, Y, 0) && !isSibling(root, X, Y);
    }
    TreeNode findNode(TreeNode node, int x){
        if(node == null){
            return null;
        }
        if(node.val == x){
            return node;
        }
        TreeNode n = findNode(node.left, x);
        if( n != null){
            return n;
        }
        return findNode(node.right, x);
    }
    boolean isSibling(TreeNode node, TreeNode X, TreeNode Y){
        if(node == null){
            return false;
        }
        return(
            (node.left == X && node.right == Y) ||  (node.left == Y && node.right == X) || isSibling(node.left, X, Y) || isSibling(node.right, X, Y)
        );
    }
    int level(TreeNode node, TreeNode X, int lev){
        if(node == null){
            return 0;
        }
        if(node == X){
            return lev;
        }
        int l = level(node.left, X, lev+1);
        if(l != 0){
            return l;
        }
        return level(node.right, X, lev+1);
    }
}