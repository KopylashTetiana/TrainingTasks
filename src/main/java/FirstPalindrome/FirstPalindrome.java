package FirstPalindrome;
//this option is faster than FirstPalindrome2
public class FirstPalindrome {
    public String findFirstPalindrome(String[] words) {
        String checkedWord = "";
        for(String word : words) {
            if(isPalindrome(word)) {
                checkedWord = word;
                break;
            }
        }
        return checkedWord;
    }

    private boolean isPalindrome(String word) {
        for(int i = 0; i < word.length()/2; i++) {
            if(word.charAt(i) != word.charAt(word.length()-1-i))
                return false;
        }
        return true;
    }


}
