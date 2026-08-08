class Solution {
    public int smallestNumber(int n, int t) {
        int p = n ;
        int multi=1;
        while(p>0){
            int  tk= p%10;
            multi*=tk;
        p=p/10;


        }
         if ( multi%t==0){
             return n ;
         }
          
          return   smallestNumber(n+1,t);
          
    }
}