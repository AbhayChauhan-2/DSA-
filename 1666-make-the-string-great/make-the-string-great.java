// class Solution {
//     public String makeGood(String s) {
//         Stack<Character> stack = new Stack();
//         for( int i =0;i<s.length();i++){
//             char ch = s.charAt(i);
//             if(!stack.isEmpty() && Character.isLowerCase(stack.peek()) && Character.isUpperCase(ch) ){
//                 if (Character.toUpperCase(stack.peek()) == ch ){
//                     stack.pop();
//                 }
//                 else {
//                     stack.push(ch);
//                 }
//             }
//            else if(!stack.isEmpty() && Character.isUpperCase(stack.peek()) && Character.isLowerCase(ch) ){
//                 if (stack.peek() == Character.toUpperCase(ch) ){
//                     stack.pop();
//                 }
//                 else {
//                     stack.push(ch);
//                 }
               


//             }
//              else {
//                     stack.push(ch);
//                 }
//         }
//         StringBuilder sb = new StringBuilder();
//          for( char chhh:stack){
//             sb.append(chhh);

//          }
//           return sb.toString();
        
//     }
// }
class Solution {
    public String makeGood(String s) {

        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!stack.isEmpty()
                    && Character.isLowerCase(stack.charAt(stack.length() - 1))
                    && Character.isUpperCase(ch)) {

                if (Character.toUpperCase(stack.charAt(stack.length() - 1)) == ch) {
                    stack.deleteCharAt(stack.length() - 1);
                }
                else {
                    stack.append(ch);
                }
            }

            else if (!stack.isEmpty()
                    && Character.isUpperCase(stack.charAt(stack.length() - 1))
                    && Character.isLowerCase(ch)) {

                if (stack.charAt(stack.length() - 1) == Character.toUpperCase(ch)) {
                    stack.deleteCharAt(stack.length() - 1);
                }
                else {
                    stack.append(ch);
                }
            }

            else {
                stack.append(ch);
            }
        }

        return stack.toString();
    }
}