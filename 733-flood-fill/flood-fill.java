// class Solution {
//     public int[][] floodFill(int[][] image, int sr, int sc, int color) {
//         int m = image.length;
//         int n = image[0].length;
//         boolean visited[][] = new boolean[m][n];

//         int num = image[sr][sc];

//         if (image[sr][sc] == num && !visited[sr][sc]) {
//             dfs(sr, sc, image, visited, num, color);
//         }

//         return image;
//     }

//     public void dfs(int i, int j, int[][] image,
//                     boolean[][] visited, int num, int color) {

//         int m = image.length;
//         int n = image[0].length;

//         visited[i][j] = true;
//         image[i][j] = color;

//         if (i - 1 >= 0 && image[i - 1][j] == num && !visited[i - 1][j]) {
//             dfs(i - 1, j, image, visited, num, color);
//         }

//         if (i + 1 < m && image[i + 1][j] == num && !visited[i + 1][j]) {
//             dfs(i + 1, j, image, visited, num, color);
//         }

//         if (j - 1 >= 0 && image[i][j - 1] == num && !visited[i][j - 1]) {
//             dfs(i, j - 1, image, visited, num, color);
//         }

//         if (j + 1 < n && image[i][j + 1] == num && !visited[i][j + 1]) {
//             dfs(i, j + 1, image, visited, num, color);
//         }
//     }
// }

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int num = image[sr][sc];

        if (num == color) return image;

        dfs(sr, sc, image, num, color);

        return image;
    }

    public void dfs(int i, int j, int[][] image, int num, int color) {

        int m = image.length;
        int n = image[0].length;

        image[i][j] = color;

        // Up
        if (i - 1 >= 0 && image[i - 1][j] == num) {
            dfs(i - 1, j, image, num, color);
        }

        // Down
        if (i + 1 < m && image[i + 1][j] == num) {
            dfs(i + 1, j, image, num, color);
        }

        // Left
        if (j - 1 >= 0 && image[i][j - 1] == num) {
            dfs(i, j - 1, image, num, color);
        }

        // Right
        if (j + 1 < n && image[i][j + 1] == num) {
            dfs(i, j + 1, image, num, color);
        }
    }
}