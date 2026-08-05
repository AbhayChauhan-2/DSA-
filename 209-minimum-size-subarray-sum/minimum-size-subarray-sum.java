class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int left =0;
          int sum=0;

       
          int lmin=Integer.MAX_VALUE;
          for( int right=0;right<nums.length;right++){
            sum+= nums[right];
             while(sum>=target){
                lmin=Math.min(lmin,right-left+1);
                sum-=nums[left];
                 left++;
             }}
          
         if (lmin==Integer.MAX_VALUE) {
             return 0;
         }
          
         return lmin;
    }
}