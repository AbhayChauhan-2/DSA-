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
   //  List<Double> list= new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
          List<Double> list = new ArrayList<>();

        if (root == null) return list;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
          //  TreeNode temp=queue.poll();
             double count=0;
            for( int i =0;i<size;i++){
                TreeNode temp=queue.poll();
                count+=temp.val;
                if( temp.left!=null){
                     queue.add(temp.left);
                }
                if( temp.right!=null){
                     queue.add(temp.right);     
                }
                
            }
             list.add(count/(double)size);

        }
        return list;
        
    }
}