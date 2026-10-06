class Solution {
    public int shortestSubarray(int[] nums, int k) {

        int n = nums.length;

        long[] prefix = new long[n];

        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        Deque<Integer> deque = new ArrayDeque<>();

        int ans = n + 1;

        for (int i = 0; i < n; i++) {

            // Single element / subarray starting from 0
            if (prefix[i] >= k) {
                ans = Math.min(ans, i + 1);
            }

            // Find shortest subarray ending at i
            while (!deque.isEmpty() &&
                   prefix[i] - prefix[deque.peekFirst()] >= k) {

                ans = Math.min(ans, i - deque.pollFirst());
            }

            // Maintain increasing prefix sums
            while (!deque.isEmpty() &&
                   prefix[i] <= prefix[deque.peekLast()]) {

                deque.pollLast();
            }

            deque.offerLast(i);
        }

        return ans == n + 1 ? -1 : ans;
    }
}