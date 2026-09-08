class Solution {
    public int upperbound( int[] arr, int m){
         int low =0; int high =arr.length-1; 
        while(low<=high){
        
        int mid = low+ ( high - low)/2;
        if ( arr[mid]>m){
            high=mid-1;
        }
         else {
            low= mid+1;
         }
         }
          return low;
    }

    public int kthSmallest(int[][] matrix, int k) {
        int low =matrix[0][0];
        int high =matrix[matrix.length-1][matrix[0].length-1];
       
         
        while(low<= high){
             int mid = low+( high -low)/2;
              int count=0;
            for ( int i =0;i<matrix.length;i++){
            count +=upperbound(matrix[i],mid);
         }
             if ( count<k){// for median of the matrix just replae the < with <=
                low=mid+1;
             }
           
            else {
                 high=mid-1;
            }
        }

        return low; 
    }
}