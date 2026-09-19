class Solution {
    public String removeDuplicates(String s) {
         if (s.length()==1) return s;
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for( int i =0;i<s.length();i++){
            if( !stack.isEmpty() && s.charAt(i)==stack.peek()){
               stack.pop();
            }
            else{
         stack.push(s.charAt(i));}
        }

        for (char ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }
}