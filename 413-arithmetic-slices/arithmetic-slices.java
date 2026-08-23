class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int nn = nums.length;
        if (nn<3){
             return 0;
        }
        int cnt =0;
        int curr=0;
        for( int i =2;i<nn;i++){
            if (nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                curr++;
                cnt+=curr;
            }
            else {
                curr=0;
            }
        }
         return cnt;
        
    }
}