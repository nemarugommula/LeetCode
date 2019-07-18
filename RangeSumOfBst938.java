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
    public int rangeSumBST(TreeNode root, int L, int R) {
        return DFS(root,L,R);
    }
    public int DFS(TreeNode root,int L,int R){
        if(root==null){
            return 0;
        }
        int data = 0;
        if(root.val>=L&&root.val<=R){
            data = root.val;
        }
        return data+DFS(root.left,L,R)+DFS(root.right,L,R);
    }
}