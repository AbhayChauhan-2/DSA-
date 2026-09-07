class Solution {
    public boolean uniformArray(int[] nums1) {
        int l1 = nums1.length;
        int min =Integer.MAX_VALUE;
        // even - odd = odd if subtractinfg odd is minimium 

        // check ofrthr odd 
        if (min%2==1){
             return true;
        }
         // if min is even odd-even = odd so check all the elemnts are the ecven ;
        for ( int i =0;i<l1;i++){
            if (nums1[i]%2==1){
                 return false;
            }
        }
        return true;
    }
}