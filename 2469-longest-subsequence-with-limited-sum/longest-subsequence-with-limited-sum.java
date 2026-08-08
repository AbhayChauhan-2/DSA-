class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;

        Arrays.sort(nums);

        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int[] arr = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int num = queries[i];

            int low = 0;
            int high = n - 1;
            int maxx = 0;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (prefix[mid] <= num) {
                    maxx = mid + 1;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            arr[i] = maxx;
        }

        return arr;
    }
}