class Solution {
    public int longestValidParentheses(String s) {
        int max=0;
        int index =-1;
        Stack<Integer> stack = new Stack();
        for( int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
              
                stack.push(i);
            }
            else {
                 if( !stack.isEmpty()){
                 stack.pop();
                 if( stack.isEmpty()){
                     max = Math.max(max,i-index);
                 }
                 else{
                    max=Math.max(max,i-stack.peek());
                 }
                 }
            else {
                  index=i;
            }
            }
            

        }
         return max;
        
    }
}