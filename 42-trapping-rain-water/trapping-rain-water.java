class Solution {
    public int trap(int[] height) {
        int n = height.length;
//  int premax[]= new int[n];
//  int suffmax[]=new int[n];
//     premax[0]=height[0];
//     suffmax[n-1]=height[n-1];
//       for ( int i =1;i<n;i++){
//         premax[i]=Math.max(premax[i-1],height[i]);
//       }
//        for ( int i =n-2;i>=0;i--){
//         suffmax[i]=Math.max(suffmax[i+1],height[i]);
//       }
//        int ans =0;
//        for ( int i =0;i<n;i++){
//      ans += Math.min(premax[i],suffmax[i])-height[i];
//        }
//        return ans ;

        int leftmax=0;
        int rightmax=0;
        int left =0;
          int right =n-1;
          int ans =0;
          while( left<right){
             if ( leftmax<height[left]){
                leftmax=height[left];
             }
               if ( rightmax<height[right]){
                rightmax=height[right];
               }
                if ( leftmax < rightmax){
                    ans +=leftmax-height[left];
                    left++;


                }
                else {
                    ans += rightmax-height[right];
                    right--;
                }
          }
           return ans;
    }
}