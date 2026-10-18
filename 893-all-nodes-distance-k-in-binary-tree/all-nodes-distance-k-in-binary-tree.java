/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
          List<Integer> ans = new ArrayList<>();
        Map<TreeNode,TreeNode> parent= new HashMap();
        parentMap(root,parent);
        BFS(root,target,k,parent,ans);
        return ans ;
    }

    public void BFS(TreeNode root, TreeNode target, int k,Map<TreeNode,TreeNode> parent,   List<Integer> ans ){
        
        Queue<TreeNode> queue= new LinkedList<>();
        Set<TreeNode> visited= new HashSet<>();
        queue.offer(target);
        visited.add(target);
        int count =0;
        while(!queue.isEmpty()){
           
            if ( count==k){
                for(TreeNode node:queue){
                    ans.add(node.val);
                }
                 return;
            }
            int size =queue.size();
          
            for( int i =0;i<size;i++){ 
                 TreeNode temp= queue.poll();
                  if ( temp.left!=null && visited.add(temp.left)){
                    queue.offer(temp.left);
                  }
                  if ( temp.right!=null && visited.add(temp.right)){
                    queue.offer(temp.right);
                  }
                  TreeNode p= parent.get(temp);
                if ( p!=null && visited.add(p)){
                    queue.offer(p);
                }


            }
              count++;
        }
       

       

    }
    public void parentMap(  TreeNode root,Map<TreeNode,TreeNode> parent){
         if ( root==null) return ;
        if( root.left!=null){
             parent.put(root.left,root);

        }
        parentMap(root.left,parent);
        if( root.right!=null){
             parent.put(root.right,root);

        }
         parentMap(root.right,parent);
    }
}