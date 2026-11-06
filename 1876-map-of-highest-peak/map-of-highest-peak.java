class Solution {
    public int[][] highestPeak(int[][] mat) {
       
        int m = mat.length;
        int n = mat[0].length;

        boolean visited[][] = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    queue.offer(new int[]{i, j, 0});
                    visited[i][j] = true;
                }
            }
        }

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int k = 0; k < size; k++) {

                int[] arr = queue.poll();

                int i = arr[0];
                int j = arr[1];
                int d = arr[2];
                  mat[i][j] = d ;
                if (i - 1 >= 0 && !visited[i - 1][j]) {
                    visited[i - 1][j] = true;
                  
                    queue.offer(new int[]{i - 1, j, d + 1});
                }

                if (i + 1 < m  && !visited[i + 1][j]) {
                    visited[i + 1][j] = true;
                   
                    queue.offer(new int[]{i + 1, j, d + 1});
                }

                if (j - 1 >= 0  && !visited[i][j - 1]) {
                    visited[i][j - 1] = true;
                   
                    queue.offer(new int[]{i, j - 1, d + 1});
                }

                if (j + 1 < n  && !visited[i][j + 1]) {
                    visited[i][j + 1] = true;
                 
                    queue.offer(new int[]{i, j + 1, d + 1});
                }
            }
        }

        return mat;
    } 
    
}