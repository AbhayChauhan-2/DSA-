class Solution {
    public char findKthBit(int n, int k) {
        if ( k==1) return '0';
        int mid = (1<<(n-1));
         if ( mid==k) return '1';
         if ( mid>k) return findKthBit(n-1,k);
         char ch =findKthBit(n-1,(1<<n)-k);
         return ch=='0'?'1':'0';
         
    }
}