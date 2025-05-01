package TwoPointers;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        boolean isvalid = false;


        int l=0,r=s.length()-1;
        if(s.length()==1)
        {
            return true;

        }
        else {
            while (l<=r)
            {
                if((int)s.charAt(l)>=97 && (int)s.charAt(l)<=122 || (s.charAt(l)>=48 && s.charAt(l)<=57))
                {
                    if((int)s.charAt(r)>=97 && (int)s.charAt(r)<=122 || (s.charAt(r)>=48 && s.charAt(r)<=57)){
                        if(s.charAt(l)==s.charAt(r)){
                            isvalid= true;
                            l++;
                            r--;
                        }
                        else {
                            return false;
                        }


                    }
                    else {
                        isvalid= true;
                        r--;
                    }
                }
                else {
                    isvalid= true;
                    l++;
                }
            }
            return isvalid;
        }


    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A ma90n, a plan, a canal: Panama"));
    }
}
