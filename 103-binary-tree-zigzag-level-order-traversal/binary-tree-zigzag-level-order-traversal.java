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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> ans= new ArrayList();
          boolean sign = true;
        check(root,ans,sign);
         return ans;

        
    }
    public void check(TreeNode root, List<List<Integer>> ans, boolean sign ){
         if ( root==null) return ;
        Queue<TreeNode> queue= new ArrayDeque();
         queue.add(root);
         while( !queue.isEmpty()){
            int size= queue.size();
            List<Integer> list= new ArrayList();
          
          for( int i=0;i<size;i++){
            TreeNode num=  queue.poll();
           list.add(num.val);
            if ( num.left!=null){
                 queue.add(num.left);

            }
            if ( num.right!=null){
                queue.add( num.right);
            }

         }
         if(sign) ans.add( list);
         else {
            Collections.reverse(list);
            ans.add(list);
         }
         sign =!sign;

    }
     
}
}