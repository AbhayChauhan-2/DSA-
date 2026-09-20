class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            if (!tokens[i].equals("+") &&
                !tokens[i].equals("-") &&
                !tokens[i].equals("*") &&
                !tokens[i].equals("/")) {

                int num = Integer.parseInt(tokens[i]);
                stack.push(num);
            }

            else if (tokens[i].equals("+")) {
                int n = stack.pop();
                int p = stack.pop();
                stack.push(n + p);
            }

            else if (tokens[i].equals("-")) {
                int ns = stack.pop();
                int ps = stack.pop();
                stack.push(ps - ns);
            }

            else if (tokens[i].equals("*")) {
                int nm = stack.pop();
                int pm = stack.pop();
                stack.push(nm * pm);
            }

            else {
                int nd = stack.pop();
                int pd = stack.pop();
                stack.push(pd / nd);
            }
        }

        return stack.peek();
    }
}