class Solution {
    public int divide(int dividend, int divisor) {
        boolean sign =  true;
        if ( dividend>=0 && divisor<0){
            sign = false;
        }
        else if( dividend<=0 && divisor>0){
             sign =false;
        }
     long n=Math.abs((long)dividend);
     long d= Math.abs((long)divisor);
     long ans =0;
     while( n>=d){
         int count=0;
          while( n>=(d<<(count+1))){
            count++;
          }
           ans +=(1L<<count);
            n =n-(d<<(count));

     }
      if ( ans==(1L<< 31) && sign){
         return Integer.MAX_VALUE;
      }
         if ( ans==(1L<< 31) && !sign){
         return Integer.MIN_VALUE;
      }
      return sign?( int)ans:(int )-ans;
        
    }
}