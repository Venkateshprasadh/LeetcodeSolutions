package Contest;

public class MaximumProductofTwoDigits {
    public static int maxProduct(int n) {
        int fmax=Integer.MIN_VALUE,smax=fmax;
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        while(n>0)
        {
            int temp = n%10;
            if(temp>fmax)
            {
                smax=fmax;
                fmax=temp;
                n=n/10;
                continue;
            }
            if(temp>smax && temp<=fmax)
            {
                smax=temp;
            }
            n=n/10;

        }
        return fmax*smax;

    }

    public static void main(String[] args) {
        System.out.println(maxProduct(133));
    }
}
