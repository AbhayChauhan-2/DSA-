// class Solution {
//     public int carFleet(int target, int[] position, int[] speed) {
// int n = position.length;  
//  int cars[][]= new int[n][2];
//   for ( int i =0;i<n;i++){
//      cars[i][0]= position[i];
//      cars[i][1]= speed[i];
//   }
//         Arrays.sort(cars, (a, b) -> b[0] - a[0]);
//          Stack<Double> stack = new Stack();
//          for( int i=0;i<n;i++){
//              double ans = (double)(target -cars[i][0])/cars[i][1];
//              if( stack.isEmpty()|| stack.peek()<ans){
//                 stack.push(ans);
//              }
//          }
//           return stack.size();

//     }
// }
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
int n = position.length;  
 int cars[][]= new int[n][2];
  for ( int i =0;i<n;i++){
     cars[i][0]= position[i];
     cars[i][1]= speed[i];
   
  }
        int count=0;
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);
         double prev=0;
         for( int i=0;i<n;i++){
             double ans = (double)(target -cars[i][0])/cars[i][1];
             if(  prev<ans){

                 prev= ans;
                 count++;
             }
         }
          return  count++;

    }
}