package TwoPointers;

import java.util.Arrays;

public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        int min=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            int cost = prices[i]-min;
            maxprofit=Math.max(cost,maxprofit);
            min=Math.min(prices[i],min);
        }
        return maxprofit;
    }


    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,90};
        System.out.println(maxProfit(arr));
    }
}
