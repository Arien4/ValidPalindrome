package practice;

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
// all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//  Given a string s, return true if it is a palindrome, or false otherwise.

// Example:
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.

// Constraints:
// 1 <= s.length <= 2 * 105
// s consists only of printable ASCII characters.

import javax.xml.stream.events.Characters;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        //System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome(".,"));
    }

    public static boolean isPalindrome(String s) {
        if (!Objects.equals(s, "")) {
            int begin = 0;
            int end = s.length() - 1;
            while (begin < end && begin < s.length() && end >= 0) {
                while (begin < s.length() && !Character.isLetterOrDigit(s.charAt(begin))) begin++;
                while (end >= 0 && !Character.isLetterOrDigit(s.charAt(end))) end--;
                if (begin > end) return true;
                if (Character.toLowerCase(s.charAt(begin)) != Character.toLowerCase(s.charAt(end))) return false;
                begin++;
                end--;
            }

        }
        return true;
    }
}
