class Solution {
    public String simplifyPath(String path) {

   Stack<String> stack= new Stack();
   String[] part = path.split("/");
   for( String st:part){
    if ( st.equals("") || st.equals(".")){
         continue;
    }
    else if ( st.equals("..")){
        if( !stack.isEmpty()){
            stack.pop();
        }
    }
    else{
        stack.push(st);
    }
   }
   StringBuilder sb = new StringBuilder();
   for( String sbb : stack){
    sb.append("/").append(sbb);
   }
   if ( sb.length()==0){
    sb.append("/");
   }
    return sb.toString();
    }
}