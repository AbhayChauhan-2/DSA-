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
    int idx=0;
    HashMap<Integer,Integer> map= new HashMap<>();

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
         for( int i =0;i<preorder.length;i++){
             map.put(postorder[i],i);

         }
          return construct(preorder,postorder,0,preorder.length-1);
    }
    public TreeNode construct(int[] preorder, int[] postorder,int start,int end){
        if (start > end || idx >= preorder.length) {
            return null;
        }
        
        TreeNode temp = new TreeNode(preorder[idx++]);

        if (start == end) {
            return temp;
        }

        int leftRoot = preorder[idx];
        int i = map.get(leftRoot);
            temp.left=construct(preorder,postorder,start,i);
            temp.right=construct(preorder,postorder,i+1,end-1);
            return temp;
           
           
           
             }
}