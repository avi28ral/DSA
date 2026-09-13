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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> ans = new ArrayList<>();
       if(root == null){
        return ans;
       }
       Queue<TreeNode> queue = new LinkedList<>();
       queue.offer(root);
       while(!queue.isEmpty()){
        int LevelSize = queue.size();
        List<Integer> CurrLevel = new ArrayList<>(LevelSize);
        for(int i = 0; i < LevelSize; i++){
            TreeNode CurrNode = queue.poll();
            CurrLevel.add(CurrNode.val);
            if(CurrNode.left != null){
                queue.offer(CurrNode.left);
            }
            if(CurrNode.right != null){
                queue.offer(CurrNode.right);
            }
        }
        ans.add(CurrLevel);
       }
       return ans;

    }
}