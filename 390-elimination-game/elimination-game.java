class Solution {
    public int lastRemaining(int n) {
         int head=1;
         int gap=1;
         int remaining = n ;
         boolean left =true;
        while( remaining>1){
             if ( left| remaining% 2==1){
                 head+=gap;
             } 
              remaining/=2;
              gap*=2;
              left=!left;

          }
        return head;
    }
}