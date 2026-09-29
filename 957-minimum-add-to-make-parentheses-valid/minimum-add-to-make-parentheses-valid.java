class Solution {
    public int minAddToMakeValid(String s) {
    //      Deque <Character> stack = new ArrayDeque<>();
    //       for ( char ch : s.toCharArray()){
    //         if ( ch =='(') stack.push('(');
            
    //         else {
    //              if ( !stack.isEmpty() && stack.peek()=='(' && ch==')' ) stack.pop() ;
    //              else{
    //                 stack.push(ch);
    //              }
            
           
    //       }
         
        
    // }
    //  return stack.size(); 
     int ans =0;
     int balance =0;
      for( char ch : s.toCharArray()){
         if ( ch=='('){
            balance++;
         }
         else if ( ch ==')'){
             if ( balance>0){
                 balance--;
             }
              else {
                ans++;
              }
         }
      } 
       return ans + balance ;
    }
}