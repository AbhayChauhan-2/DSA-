class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        double max = Double.NEGATIVE_INFINITY;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            if (right - left + 1 == k) {
                max = Math.max(max, (double) sum / k);

                sum -= nums[left];
                left++;
            }
        }

        return max;
    }
}