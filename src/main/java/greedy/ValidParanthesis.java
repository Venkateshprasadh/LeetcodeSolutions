package greedy;

import java.util.Stack;

public class ValidParanthesis {

    public static boolean isValid(String s)
    {
        if(s.length()==1)
        {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)=='}' || s.charAt(i)==')' || s.charAt(i)==']'))
            {
                if(!stack.isEmpty() && stack.peek()==opposite(s.charAt(i))){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    private static char opposite(char c) {

        switch(c)
        {
            case '}':
                return '{';
            case ')':
                return '(';
            case ']':
                return '[';
            default:
                return ' ';
        }
    }

    public static void main(String[] args) {
        System.out.println(isValid("]]"));
    }
}
