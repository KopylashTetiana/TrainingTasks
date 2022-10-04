import FirstPalindrome.*;

public class Main {
    public static void main(String[] args) {
        //Task 1: find first palindrome in String array.
        String [] words = {"apple", "corn", "racecar", "sum", "abba"};
        //1st option - faster and better
        FirstPalindrome fp = new FirstPalindrome();
        System.out.println(fp.findFirstPalindrome(words));
        //2nd option - slower and spend more memory
        FirstPalindrome2 fp2 = new FirstPalindrome2();
        System.out.println(fp2.firstPalindrome(words));
        //
    }
}
