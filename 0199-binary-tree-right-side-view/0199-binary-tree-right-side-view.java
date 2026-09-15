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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode last = null;
            int levelSize = queue.size();
            for(int i =0; i < levelSize; i++){
                last = queue.poll();
                if(last.left != null){
                    queue.offer(last.left);
                }
                if(last.right != null){
                    queue.offer(last.right);
                }
            }
            ans.add(last.val);
        }
        return ans;
    }
}