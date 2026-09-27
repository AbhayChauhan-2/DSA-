class Solution {

    public String decodeString(String s) {
        Stack<Integer>numstack = new Stack();
        Stack<Character> charstack = new Stack<>();
        int num=0;
        for( int i =0;i<s.length();i++){
         char ch =s.charAt(i);
         if (Character.isDigit(ch) ){
             if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
         }

            else if (ch == '[') {
                numstack.push(num);
                num = 0;
                charstack.push(ch);
            }
         else if(ch==']'){
         StringBuilder sb = new StringBuilder();
         while(!charstack.isEmpty() && charstack.peek()!='[' ){
            sb.append(charstack.pop());

         }
         charstack.pop();
     String str=   sb.reverse().toString();
        int numm = numstack.pop();
        for( int j =0;j<numm;j++){
            for (char c : str.toCharArray()) {
                        charstack.push(c);
                    }
        }
        }
        else {
            charstack.push(ch);
        }
        }
        StringBuilder sbb= new StringBuilder();
        for( char chh:charstack){
            sbb.append(chh);

        }
        

 return sbb.toString();

         
        
    }
}