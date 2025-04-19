package TwoPointers;

public class ReverseString {

    private static char[] reverse(char[] c)
    {
        int left=0,right=c.length-1;
        while (left<=right)
        {
            char temp= c[left];
            c[left]=c[right];
            c[right] = temp;
            left++;
            right--;
        }
        return c;
    }
    public static void main(String[] args) {
        String s= "hello";
        System.out.println(reverse(s.toCharArray()));
    }
}
