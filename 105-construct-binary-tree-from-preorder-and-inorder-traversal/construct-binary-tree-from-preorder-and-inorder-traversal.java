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
/*class Solution {
    int idx;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         idx =0;
        
          return build( preorder,inorder,0,preorder.length-1);




        
    }
     public TreeNode build( int[] preorder,int[] inorder, int start, int end){
        if( start>end) return null;
         int rootval= preorder[idx++];
         int i=start;
         for( ;i<=end;i++){
             if ( rootval==inorder[i]){
                
                 break;
             }
         }
          TreeNode root= new TreeNode(rootval);

          root.left=  build( preorder,inorder,start,i-1);
          root.right=  build( preorder,inorder,i+1,end);
          return root;
     }
}*/
class Solution {
    int idx;
    HashMap<Integer,Integer> map= new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
          for ( int i =0;i<inorder.length;i++){
             map.put(inorder[i],i);

          }
        
          return build( preorder,inorder,0,preorder.length-1);




        
    }
     public TreeNode build( int[] preorder,int[] inorder, int start, int end){
        if( start>end) return null;
         int rootval= preorder[idx++];
      
          TreeNode root= new TreeNode(rootval);
          int i= map.get(rootval);

          root.left=  build( preorder,inorder,start,i-1);
          root.right=  build( preorder,inorder,i+1,end);
          return root;
     }
}