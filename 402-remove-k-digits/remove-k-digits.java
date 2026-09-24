
   /* class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder(num);

        int j = 0;

        while (k > 0 && j < sb.length() - 1) {

            if (sb.charAt(j) > sb.charAt(j + 1)) {
                sb.deleteCharAt(j);
                k--;

                if (j > 0) {
                    j--;
                }
            } else {
                j++;
            }
        }

        // If no decreasing pair exists,
        // remove remaining digits from the end.
        while (k > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        // Remove leading zeroes
        int start = 0;

        while (start < sb.length() - 1 && sb.charAt(start) == '0') {
            start++;
        }

        return sb.substring(start);
    }
} */
    class Solution {
    public String removeKdigits(String num, int k) {

       if ( k == num.length()){
         return "0";
       }
    Stack<Character> stack = new Stack<>();
    for( int i =0;i<num.length();i++){
        while(!stack.isEmpty() && k>0 && stack.peek()>num.charAt(i)){
            stack.pop();
            k--;

        }
        stack.push(num.charAt(i));
    }
     while( k>0 ){
        stack.pop();
        k--;
     }
     StringBuilder sb = new StringBuilder();
     while( !stack.isEmpty()){
        sb.append(stack.pop());
     }
     sb.reverse();
     int start=0;
     while( (start<sb.length()-1) && sb.charAt(start)=='0'){
         start++;
     }
     return sb.substring(start).toString();
    }


}
