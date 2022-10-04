package FirstPalindrome;
//this option is not so fast as FirstPalindrome
public class FirstPalindrome2 {
    public String firstPalindrome(String[] words) {
        for(String w : words) {
            if(isPalindrome(w)) {
                return w;
            }
        }
        return "";
    }

    private static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        return s.equals(reverse);
    }
}
