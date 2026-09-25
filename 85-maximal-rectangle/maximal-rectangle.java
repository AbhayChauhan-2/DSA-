import java.util.*;

class Solution {
    public int maximalRectangle(char[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] heights = new int[rows][cols];

        // Build heights
        for (int j = 0; j < cols; j++) {

            int sum = 0;

            for (int i = 0; i < rows; i++) {

                if (matrix[i][j] == '1') {
                    sum++;
                } else {
                    sum = 0;
                }

                heights[i][j] = sum;
            }
        }

        int max = 0;

        for (int i = 0; i < rows; i++) {

            max = Math.max(
                max,
                largestRectangleArea(heights[i])
            );
        }

        return max;
    }

    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();

        int sum = 0;

        for (int i = 0; i < heights.length; i++) {

            while (!stack.isEmpty() &&
                   heights[stack.peek()] >= heights[i]) {

                int index = stack.pop();

                int pse = stack.isEmpty() ? -1 : stack.peek();

                int area = heights[index] * (i - pse - 1);

                sum = Math.max(sum, area);
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {

            int nse = heights.length;

            int index = stack.pop();

            int pse = stack.isEmpty() ? -1 : stack.peek();

            int area = heights[index] * (nse - pse - 1);

            sum = Math.max(sum, area);
        }

        return sum;
    }
}