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
     int maxsum=0;
    static class Info{
        boolean isbst;
        int min;
        int max;
        int sum;
        Info(boolean isbst,int min,int max, int sum){
            this.isbst=isbst;
            this.min=min;
            this.max= max;
            this.sum=sum;
        }

    }
    public int maxSumBST(TreeNode root) {
         maxsum=0;
         postorder(root);
         return maxsum;
    }
    public Info postorder(TreeNode root){
        if ( root==null)   return new Info(true,Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        Info left=postorder(root.left);
        Info right=postorder(root.right);
        if ( left.isbst && right.isbst && root.val>left.max && root.val<right.min){
            int rowsum= root.val+left.sum+right.sum;
            maxsum=Math.max(maxsum,rowsum);
             return new Info(true,Math.min(left.min,root.val),Math.max(right.max,root.val),rowsum);
        }
         return new Info(false,0,0,0);

    }
}