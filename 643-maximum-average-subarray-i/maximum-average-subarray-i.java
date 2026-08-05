class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        double dam = 0;

        double max = Double.NEGATIVE_INFINITY;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];   

            while (right - left + 1 > k) {
                sum -= nums[left];
                left++;
            }

            if (right - left + 1 == k) {
                dam = (double) sum / k;  
                max = Math.max(max, dam);
            }
        }

        return max;
    }
}