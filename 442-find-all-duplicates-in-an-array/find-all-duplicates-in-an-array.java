/*class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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
          for ( int i =0;i<n;i++){
            if (nums[i]!=i+1){
                 num.add(nums[i]);
            }
          }
         return num;
        
    }
}*/
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                ans.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }

        return ans;
    }
}