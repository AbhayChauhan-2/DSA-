class Solution { 
    public String removeDuplicateLetters(String s) { 
     boolean seen[]= new boolean[26];
     int[] lastindex= new int[26];
        Stack<Character> stack = new Stack<>(); 


        for (int i = 0; i < s.length(); i++) { 
            lastindex[s.charAt(i)-'a']=i;}
        for (int i = 0; i < s.length(); i++) { 
            
          // lastindex[s.charAt(i)-'a']--;
           if ( seen[s.charAt(i)-'a']){
            continue;
           }
            while (!stack.isEmpty() && stack.peek() > s.charAt(i) && lastindex[stack.peek()-'a']>i) { 
               seen[stack.pop()-'a']=false;
            } 

            

            stack.push(s.charAt(i));
            seen[s.charAt(i)-'a']=true; 
        } 
 StringBuilder sb = new StringBuilder();
 for( char sbb: stack){
    sb.append(sbb);
 }
        return sb.toString(); 
    } 
}