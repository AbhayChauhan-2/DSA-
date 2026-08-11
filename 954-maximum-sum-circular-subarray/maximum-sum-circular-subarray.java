class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n =nums.length;
         int maxnum=0;
         int maxx =Integer.MIN_VALUE;
          
        int minn = Integer.MAX_VALUE;
        int minnum = 0;
        int sum = 0;


          for(int i =0;i<n;i++){
 
            if(maxnum+nums[i]>nums[i]){
                maxnum=maxnum+nums[i];
            }
            else{
                maxnum=nums[i];
            }
             if( maxx<maxnum){
                 maxx =maxnum;
             }
          
 
             sum+=nums[i];
       
            if(minnum+nums[i]<nums[i]){
                minnum=minnum+nums[i];
            }
            else{
                minnum=nums[i];
            }
             if( minn>minnum){
                 minn =minnum;
             }
          }
         if (maxx < 0)
    return maxx;
else
    return Math.max(maxx, sum - minn);

    }
}