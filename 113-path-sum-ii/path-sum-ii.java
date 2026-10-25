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
     List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       
        List<Integer> node = new ArrayList<>();
         hasPathSum(root,targetSum,node);
          return ans;
    }
     public boolean isLeaf(TreeNode root){
         if ( root.left==null && root.right==null){
             return true;
         }else{
             return false;
         }
     }
      public void hasPathSum(TreeNode root, int targetSum,List<Integer> node) {
        
         if ( root== null) return ;
         targetSum-=root.val;
          node.add(root.val);
          if ( targetSum==0 && isLeaf(root)){
           ans.add(new ArrayList<>(node));}
        hasPathSum(root.left,targetSum,node) ;
        hasPathSum(root.right,targetSum,node);
       
           node.remove(node.size()-1 );

    }
}