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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null){
            return null;
        }
       List<List<Integer>> answer = new LinkedList<>();
        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);
        while(Q.size()>=1){
         List<Integer> rs = new ArrayList<>();  
        int size = Q.size();
            for(int i=0;i<size;i++){
            TreeNode temp = Q.poll();
             
            if(temp.left!=null){
                Q.add(temp.left);
            }
            if(temp.right!=null){
                Q.add(temp.right);
            }
                rs.add(temp.val);
            }
           answer.addFirst(rs);
        }
        return answer;
    }
}