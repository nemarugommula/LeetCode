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
    ArrayList<Integer> AL = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        DFS(root);
        TreeNode answer = new TreeNode(-1);
        TreeNode dump = answer;
        for(int i : AL){
            answer.right=new TreeNode(i);
            answer=answer.right;
        }
        return dump.right;
    }
    public void DFS(TreeNode root){
        if(root==null){
            return ;
        }
        DFS(root.left);
        AL.add(root.val);
        DFS(root.right);
    }
}