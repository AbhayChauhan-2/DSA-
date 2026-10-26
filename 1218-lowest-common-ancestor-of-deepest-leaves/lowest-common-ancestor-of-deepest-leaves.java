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
// class Solution {
//     HashMap<Integer,Integer>  map= new HashMap<>();
//     int maxDepth=0;
//     public void depth(TreeNode root,int depth){
//         if ( root==null) return;
//         map.put(root.val,depth);
//         maxDepth= Math.max(maxDepth,depth);
//         depth(root.left,depth+1);
//         depth(root.right,depth+1);
//     }
//     public TreeNode lca(TreeNode root){
//          if ( root==null || map.get(root.val)==maxDepth){
//              return root;
//          }
//          TreeNode left=lca(root.left);
//          TreeNode right=lca(root.right);
//          if (left!=null && right!=null) return root;
//          if ( left!=null) return left;
//          return right;

//     }
//     public TreeNode lcaDeepestLeaves(TreeNode root) {
//          depth( root,0);
//         return  lca(root);

       
//     }

// }
//upper one is tc =2on and sc = on
//this one tc= on and sc =0h
class Solution {
    static class Result{
     TreeNode  node ;
     int depth;
     Result(int depth,TreeNode node){
        this.node= node;
        this.depth= depth;
     }
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
       return solve(root).node;
      
    }
    public Result solve( TreeNode root){
         if ( root ==null){
            return new Result( 0, root);
         }
          Result left=solve(root.left);
          Result right=solve(root.right);
           if ( left.depth== right.depth){
             return new Result(left.depth+1,root);

           }
            if ( left.depth> right.depth){
             return new Result(left.depth+1,left.node);

             
           }
            else{
             return new Result(right.depth+1,right.node);
             
           }


    }
}