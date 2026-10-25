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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue= new LinkedList<>();
         queue.offer(root);
        
          while(!queue.isEmpty()){
             int size =queue.size();
              boolean markX =false;
         boolean markY =false;
             for( int i=0;i<size;i++){
                 TreeNode node= queue.poll();
                 if ( ( node.left!=null) &&( node.right!=null)&&( (node.right.val==x && node.left.val==y)|| (node.right.val==y && node.left.val==x)) ) return false;


                  if (node.val==x) markX=true;
                  if (node.val==y) markY=true;

                
                  if ( node.left!=null){
                     queue.offer(node.left);

                  }
                   if ( node.right!=null){
                     queue.offer(node.right);
                     
                  }
             }
            if ( markX == true && markY== true){
                     return true;
                   }
                    if ( markX == true || markY== true){
                     return false;
                   }
          }
           
         return false;



    }
}