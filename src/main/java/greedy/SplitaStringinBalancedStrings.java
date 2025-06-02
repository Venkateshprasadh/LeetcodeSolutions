package greedy;

public class SplitaStringinBalancedStrings {
    public static int balancedStringSplit(String s) {
        int sum=0,r=0,l=0,count=0;
        while (r<s.length())
        {
            if(s.charAt(r)=='R')
            {
                sum+=1;
            }
            else if(s.charAt(r)=='L')
            {
                sum-=1;
                l++;
            }
            if(sum==0)
            {
                count++;
            }
            r++;
        } return count;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("LLLLRRRR"));
    }
}
