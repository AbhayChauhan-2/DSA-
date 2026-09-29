class Solution {
    public int minSwaps(String s) {
        


        // Stack<Character> stack = new Stack<>();

        // for (char ch : s.toCharArray()) {

        //     if (ch == '[') {
        //         stack.push(ch);
        //     } 
        //     else {
        //         if (!stack.isEmpty() && stack.peek() == '[') {
        //             stack.pop();
        //         } 
        //         else {
        //             stack.push(ch);
        //         }
        //     }
        // }

        // int ans = stack.size();

        // return (ans + 1) / 2;

     
      
     int i =0;

     int ans =0;
   for( char ch: s.toCharArray()){
    if ( ch=='['){
         i++;
    }
     else{
         if ( i>0){
            i--;
         }
         else{
             ans++;
         }
     }
   
   }
     return (ans + 1) / 2;   
    }
}