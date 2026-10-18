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
    class Pair {
        TreeNode node;
        long index;

        Pair(TreeNode node, long index) {
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        long maxWidth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            long minIndex = queue.peek().index;
            long first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair p = queue.poll();

                TreeNode curr = p.node;
                long idx = p.index - minIndex;

                if (i == 0) first = idx;
                if (i == size - 1) last = idx;

                if (curr.left != null) {
                    queue.offer(new Pair(curr.left, 2 * idx));
                }

                if (curr.right != null) {
                    queue.offer(new Pair(curr.right, 2 * idx + 1));
                }
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return (int) maxWidth;
    }
}