package greedy;

import java.util.Arrays;

public class AssignCookies {

    public static int findContentChildren(int[] g, int[] s) {

        int l=0,r=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (l<g.length && r<s.length)
        {
            if(g[l]<=s[r])
            {
                l++;
                r++;
            }else {
                r++;
            }
        }
        return l;

    }

    public static void main(String[] args) {
        int[] g = {10,9,8,7}; int[] s = {5,6,7,8};
        System.out.println(findContentChildren(g,s));
    }
}
