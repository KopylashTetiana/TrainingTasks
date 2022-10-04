import FirstPalindrome.*;

public class Main {
    public static void main(String[] args) {
        //Task 1: find first palindrome in String array.
        String [] words = {"apple", "corn", "racecar", "sum", "abba"};
        FirstPalindrome fp = new FirstPalindrome();
        System.out.println(fp.findFirstPalindrome(words));
        //
    }
}
