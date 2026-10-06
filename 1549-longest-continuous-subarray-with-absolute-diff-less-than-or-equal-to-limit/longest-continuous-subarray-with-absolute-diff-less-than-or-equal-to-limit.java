class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> demin= new ArrayDeque();
        Deque<Integer> deman= new ArrayDeque();
        int ans = 0;
        int left=0;

         for ( int i=0;i<nums.length;i++){
            // min increaasing order 
              while(!demin.isEmpty() && nums[demin.peekLast()]>nums[i]){
            demin.pollLast();
              }
             demin.offerLast(i);
             //max decreasig order 
              while(!deman.isEmpty() && nums[deman.peekLast()]<nums[i]){
            deman.pollLast();
              }
             deman.offerLast(i);
               while (nums[deman.peekFirst()] - nums[demin.peekFirst()] > limit) {

                if (demin.peekFirst() == left) {
                    demin.pollFirst();
                }

                if (deman.peekFirst() == left) {
                    deman.pollFirst();
                }

                left++;
            }

            ans = Math.max(ans, i - left + 1);

              }
             
     return ans ;
    }
}