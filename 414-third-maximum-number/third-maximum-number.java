class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;

        Long largest = null;
        Long second = null;
        Long third = null;

        for (int i = 0; i < n; i++) {

            if ((largest != null && nums[i] == largest) ||
                (second != null && nums[i] == second) ||
                (third != null && nums[i] == third)) {
                continue;
            }

            if (largest == null || nums[i] > largest) {
                third = second;
                second = largest;
                largest = (long) nums[i];
            } else if (second == null || nums[i] > second) {
                third = second;
                second = (long) nums[i];
            } else if (third == null || nums[i] > third) {
                third = (long) nums[i];
            }
        }

        return third == null ? largest.intValue() : third.intValue();
    }
}