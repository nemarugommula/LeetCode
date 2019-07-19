/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.left==null&&root.right==null){
            return true;
        }
        if(root.left==null){
            if(isUnivalTree(root.right)){
                return root.val==root.right.val;
            }
        }
        if(root.right==null){
            if(isUnivalTree(root.left)){
                return root.val==root.left.val;
            }
        }
        if(isUnivalTree(root.left)&&isUnivalTree(root.right)){
            if(root.val==root.left.val&&root.val==root.right.val){
                return true;
            }
        }
        return false;
        
    }
   
}