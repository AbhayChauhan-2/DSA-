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
        List<List<Integer>> list= new ArrayList();
         if ( root== null) return list;
      
        Queue<TreeNode> queue= new ArrayDeque();
           queue.offer(root);
          while(!queue.isEmpty()){
         List<Integer> list1= new ArrayList();
      
          int size = queue.size();
      
           for ( int i=0;i<size;i++){  
            TreeNode temp = queue.poll();
            list1.add(temp.val);
            if ( temp.left!=null)  queue.offer( temp.left);
            if ( temp.right!=null)  queue.offer( temp.right);
            
           }
           list.add(list1);


            
        
    }
     return list;
}
}