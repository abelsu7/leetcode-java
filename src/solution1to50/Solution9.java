package solution1to50;

// Leetcode 9. Palindrome Number
public class Solution9 {
    public boolean isPalindrome(int x) {
        /**
         * if x < 0 or end up with 0 ( except 0 itself )
         * then return false
         */
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverseNumber = 0;
        while (x > reverseNumber) {
            reverseNumber = reverseNumber * 10 + x % 10;
            x /= 10;
        }

        return x == reverseNumber || x == reverseNumber / 10;
    }
}