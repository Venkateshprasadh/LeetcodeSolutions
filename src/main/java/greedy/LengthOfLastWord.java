package greedy;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] s1 = s.trim().split(" ");
        return s1[s1.length-1].length();
    }

    public static void main(String[] args) {
System.out.println(lengthOfLastWord("Hello World"));
    }
}
