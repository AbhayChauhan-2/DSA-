class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
         int psum =Integer.MIN_VALUE;
         int sum=0;
        for( int i =0;i<n;i++){
             sum = sum+nums[i];
             if (sum>psum){
                psum=sum;
             }
             if ( sum<0){
                sum=0;
             }

        }
        int suum=0;
           int nsum =Integer.MAX_VALUE;
        for( int i =0;i<n;i++){
             suum = suum+nums[i];
             if (suum<nsum){
                nsum=suum;
             }
             if ( suum>0){
                suum=0;
             }

        }
         return  Math.max(psum, Math.abs(nsum));

    }
}