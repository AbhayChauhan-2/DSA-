class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
         int suffixsum[]=new int[n];
         suffixsum[n-1]=nums[n-1];
         int prefixsum[]=new int[n];
         prefixsum[0]=nums[0];
         int index=-1;
         for( int i =n-2;i>=0;i--){
            suffixsum[i]=suffixsum[i+1]+nums[i];
         }
         for( int i =1;i<n;i++){
            prefixsum[i]=prefixsum[i-1]+nums[i];

         }
        for( int i =0;i<n;i++){
            suffixsum[i]-=nums[i];
            prefixsum[i]-=nums[i];
            if (prefixsum[i]==suffixsum[i]){
                   index=i;
             break;
    // return;
}}
return index;

        
    }
}