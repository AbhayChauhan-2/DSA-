class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[2*n];
        int nn = nums.length;
    
        int cnt =0;
       for (int i =0;i<n;i++ ){
        arr[cnt]=nums[i];
        cnt+=2;
       }
       int ntt=1;
       for( int i =n;i<nn;i++){
        arr[ntt]=nums[i];
         ntt+=2;

       }
        return arr;
        
    }
}