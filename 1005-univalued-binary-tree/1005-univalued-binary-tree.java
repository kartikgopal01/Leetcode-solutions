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
    public boolean isUnivalTree(TreeNode root) {
        return isUnival(root,root.val);
    }
    public static boolean isUnival(TreeNode node,int val){
        if(node==null){
            return true;
        }
        if(node.val !=val){
            return false;
        }

        return isUnival(node.left,val) && isUnival(node.right,val);

    }
}