class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer>stack = new Stack<>();
         for( int i =0;i<asteroids.length;i++){
            boolean sb = false;
            while(!stack.isEmpty() && stack.peek()>0 && asteroids[i]<0){
                if ( Math.abs(stack.peek())<Math.abs(asteroids[i])){
                    stack.pop();
                //break; continue brekaing till else if or else case not meet or stack empty 
                }
                else if (Math.abs(stack.peek())==Math.abs(asteroids[i])){
                    sb=true;
                  stack.pop();
                  break;
                }
                else {
                    sb=true;
                    break;
                }
            }
            if ( !sb){
                stack.push(asteroids[i]);
            }
 
         }
            int[] ans = new int[stack.size()];
        int i = 0;

        for (int num : stack) {
            ans[i++] = num;
        }

        return ans;
        
    }
}