package SlidingWindow.variable;

import java.util.HashSet;

public class LongestSubstring {

private static int  longest(String s)
    {
        HashSet<Character> set  = new HashSet<>();
        int l=0,r=0,length=0,maxlength=0;
        if(s.length()==1)
        {
            return 1;
        }
        while (r<s.length())
        {
            if(!set.contains(s.charAt(r)))
            {
                set.add(s.charAt(r));
                length++;
                maxlength = Math.max(length,maxlength);
                r++;
            }
            while (!set.isEmpty() && r<s.length() && set.contains(s.charAt(r)))
            {
                set.remove(s.charAt(l));
                l++;
                length--;

            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
    System.out.println(longest("abcabcbb"));
    }
}
