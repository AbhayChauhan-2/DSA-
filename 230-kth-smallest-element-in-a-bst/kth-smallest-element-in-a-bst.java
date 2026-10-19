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
   int cnt =0;
   int ans =0;
    public int kthSmallest(TreeNode root, int k) {
   Smallest(root,k);
    return ans;
      
    }
    public  void Smallest(TreeNode root, int k  ){
        
         if (  root ==null){
             return ;
         }
         
        Smallest(root.left,k);
         cnt++;
          if ( cnt == k){
               ans = root.val;
          }
         Smallest(root.right,k);
      
    }
}