class Solution {
    public int countifyes( int[] nums, int mid, int maxOperations){
        int count =0;
        for ( int i=0;i<nums.length;i++){
            count +=(nums[i]-1)/mid;
            if (count>1000000000){
                 return count;
            }
           /*  mine code 
           if(nums[i]>mid){
               count+=Math.ceil((double)nums[i]/(double)mid)-1;
            }*/
        }
        return count ;
        
        
    }
    public int minimumSize(int[] nums, int maxOperations) {int low=1;
    int high =0;
     for ( int i =0;i< nums.length;i++){
        high = Math.max( high , nums[i]);
     }
    
     while( low<=high){
        int mid= low+(high-low)/2;
        if ( countifyes(nums,mid,maxOperations)<= maxOperations){

            high = mid-1;
        }
        else{
             low= mid+1;
        }
        
     }
      return low;
        
    }
}