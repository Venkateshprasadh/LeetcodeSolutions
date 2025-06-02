package greedy;

import java.util.Stack;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        Stack<Integer> stack = new Stack<>();
        if(n==0)
        {
            return true;
        }
        if(flowerbed[0]==0)
        {
            stack.push(1);
            n--;
        }
        else {
            stack.push(flowerbed[0]);
        }

        for(int i=1;i<flowerbed.length;i++)
        {
            if(!stack.isEmpty() && stack.peek()==1 && flowerbed[i]==0)
            {
                stack.push(0);
            }
            else if(!stack.isEmpty() && stack.peek()==0 && flowerbed[i]==0)
            {
                stack.push(1);
                if(n>0)
                {
                    n--;
                }
                else {
                    break;
                }

            }
            else if(stack.peek()==1 && flowerbed[i]==1)
            {
                n++;
            }
            else {
                stack.push(flowerbed[i]);
            }
        }
        return n==0?true:false;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,1,0,0};int n=0;
        System.out.println(canPlaceFlowers(arr,n));
    }
}
