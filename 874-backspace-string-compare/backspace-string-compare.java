class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack();
        for( int i =0;i<s.length();i++){
            char ch = s.charAt(i);
              if ( Character.isLetter(ch)){
                stack.push(ch);

              }
              else if ( ch=='#'){
                if(!stack.isEmpty()){
                 stack.pop();}
              }
        }
         StringBuilder sb = new StringBuilder();
         for( char chh : stack){
            sb.append(chh);
         }
         String sbb= sb.toString();
         stack.clear();
          for( int i =0;i<t.length();i++){
            char chhr = t.charAt(i);
              if ( Character.isLetter(chhr)){
                stack.push(chhr);

              }
              else if ( chhr=='#'){
                if(!stack.isEmpty()){
                 stack.pop();}
              }
        }
         StringBuilder sbd = new StringBuilder();
         for( char chhh :stack){
            sbd.append(chhh);
         }
         String sbbd= sbd.toString();
          return sbb.equals(sbbd);
        
    }
}