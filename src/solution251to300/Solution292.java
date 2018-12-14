package solution251to300;

// Leetcode 292. Nim Game
public class Solution292 {
    public boolean canWinNim(int n) {
        // Bash Game - n % (m + 1) != 0. First will win.
        return n % 4 != 0;
    }
}