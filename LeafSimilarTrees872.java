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
   ArrayList<Integer> BL = new ArrayList<>();
   public boolean leafSimilar(TreeNode root1, TreeNode root2) {
      
       DFS(root1);
       DFS1(root2);
            
       int length=Math.min(AL.size(),BL.size());
       for(int i=0;i<length;i++){ 
           if(AL.get(i)!=BL.get(i)){
               return false;
           }
       }
       
       return true;
       
   }
   public void DFS(TreeNode root){
       if(root==null)
       {
           return ;
       }
       if(root.left==null&&root.right==null){
           AL.add(root.val);
       }
       DFS(root.left);
       DFS(root.right);
   }
    public void DFS1(TreeNode root){
       if(root==null)
       {
           return ;
       }
       if(root.left==null&&root.right==null){
           BL.add(root.val);
       }
       DFS1(root.left);
       DFS1(root.right);
   }
}