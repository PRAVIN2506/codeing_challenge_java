package Day_91;

import java.util.Stack;

class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> st = new Stack<>();
        char temp = ' ', op = ' ';

        for(char ch : expression.toCharArray()) {
            if(ch == '(' || ch == ',')
                continue;

            if(ch == 't' || ch == 'f' || ch == '!' || ch == '&' || ch == '|')
                st.push(ch);
            else if (ch == ')') {
                boolean hasTrue = false, hasFalse = false;
                while(st.peek() != '!' && st.peek() != '&' && st.peek() != '|') {
                    char val = st.pop();
                    if(val == 't') hasTrue = true;
                    if(val == 'f') hasFalse = true;
                }
                if(!st.isEmpty())
                    op = st.pop();
                if(op == '!') {
                    temp = hasTrue ? 'f' : 't';
                } else if(op == '&') {
                    temp = (hasTrue && !hasFalse) ? 't' : 'f';
                } else if(op == '|') {
                    temp = hasTrue ? 't' : 'f';
                }
                st.push(temp);
            }
        }
        return st.peek() == 't';
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String expression1 = "|(&(t,f,t),!(t))";
        System.out.println("Expression 1: " + expression1 + " => " + solution.parseBoolExpr(expression1));

        String expression2 = "&(|(f),t)";
        System.out.println("Expression 2: " + expression2 + " => " + solution.parseBoolExpr(expression2));
    }
}
