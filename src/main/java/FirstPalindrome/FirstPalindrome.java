package FirstPalindrome;
public class FirstPalindrome {
    public String findFirstPalindrome(String[] words) {
        for(String word : words) {
            if(isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }
    //this method is faster and better than isPalindrome2()
    private static boolean isPalindrome(String s) {
        for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
    //this method spends more time and memory than isPalindrome()
    private static boolean isPalindrome2(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        return s.equals(reverse);
    }

}
