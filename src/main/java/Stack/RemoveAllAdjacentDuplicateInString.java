package Stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicateInString {

    private static String removeAdjacentDuplicate(String s)
    {
        Stack<Character> unique = new Stack<>();
        unique.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(!unique.isEmpty()&& unique.peek()==s.charAt(i))
            {
                unique.pop();
            }
            else {
                unique.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!unique.isEmpty())
        {
            sb.append(unique.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(removeAdjacentDuplicate("abbaca"));
    }
}
