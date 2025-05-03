package greedy;

public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int five=0,ten=0,l=0;
        boolean change=false;
        while(l<bills.length)
        {
            if(bills[l]==5)
            {
                five++;
                change=true;
            }
            else if(bills[l]==10 && five>=1)
            {
                five--;
                ten++;
                change=true;
            }

            else if(bills[l]==20 )
            {
                if(ten>=1 && five>=1)
                {
                    ten=ten-1;
                    five=five-1;
                    change=true;
                } else if (five>=3) {
                    five= five-3;
                    change=true;
                }
                else {
                    change= false;
                    break;
                }


            }l++;
        }
        return change;
    }

    public static void main(String[] args) {
        int bills[]={5,5,5,10,20};
        System.out.println(lemonadeChange(bills));
    }
}
