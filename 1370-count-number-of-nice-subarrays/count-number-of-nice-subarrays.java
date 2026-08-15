class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
         return   numberOfSubarray(nums, k) -  numberOfSubarray( nums, k-1) ;
    }
      public int numberOfSubarray(int[] nums, int k) {
         int left =0;
          int cnt =0;
          int num=0;
          for( int right=0;right<nums.length;right++){
             if (nums[right]%2==1){
                cnt++;
             }
              while(  cnt>k ){
                
         
                if(nums[left]%2==1){
                    cnt--;
                }
                 left++;
              }
              
               num+=right -left+1;
              
             
          }
           return num;
      }

    }
