class Solution {
    public int[] findErrorNums(int[] nums) {
            List<Integer> num=new ArrayList<>();
         int n =nums.length;
         for ( int i =0;i<n;i++){
            while(nums[i]!=i+1){
                int pt =nums[i]-1;
                if ( nums[pt]==nums[i]){
                    break;
                }
                int temp = nums[pt];
                nums[pt]=nums[i];
                nums[i]=temp;
            }
         }
         int arr[]=new int[2];
          for (int i = 0; i < n; i++) {
    if (nums[i] != i + 1) {
        arr[0] = nums[i];   
        arr[1] = i + 1;   
        break;
    }
}
         return arr;
            }
}