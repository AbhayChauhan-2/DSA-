class Solution {

    static class Pair {
        TreeNode node;
        int row;
        int col;

        Pair(TreeNode node, int row,int col) {
            this.node = node;
            this.row = row;
            this.col=col;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) return ans;

        TreeMap<Integer, TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0,0));

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                Pair temp = queue.poll();

                TreeNode nod = temp.node;
                int row = temp.row;
                int col=temp.col;

                if (!map.containsKey(col)) {
                    map.put(col, new TreeMap<>());
                }
                 if (!map.get(col).containsKey(row)) {
                    map.get(col).put(row, new PriorityQueue<>());
                }

              map.get(col).get(row).add(nod.val);

                if (nod.left != null) {
                    queue.offer(new Pair(nod.left,row+1,col-1));
                }

                if (nod.right != null) {
                    queue.offer(new Pair(nod.right,row+1,col+1));
                }
            }
        }

       for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {

            List<Integer> column = new ArrayList<>();

            for (PriorityQueue<Integer> pq : rows.values()) {

                while (!pq.isEmpty()) {
                    column.add(pq.poll());
                }
            }

            ans.add(column);
        }

        return ans;
    }
}