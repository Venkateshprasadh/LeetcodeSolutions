package Learnings.DP_Recurssion_BackTracing;

public class ReversePrint {


    public static void main(String[] args) {
        //4 3 2 1
    //    Scanner sc = new Scanner(System.in);
     //   int n = sc.nextInt();
        yesprint(1,1);
    }

    private static void yesprint(int n, int n1) {
        if(n>4)
        {
            return;
        }
        yesprint(n+1,n1);
        System.out.println(n);
    }
}
