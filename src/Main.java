import common.*;
import solution1to50.*;
import solution101to150.*;
import solution251to300.*;

public class Main {
    public static void main(String[] args) {
        test9();
    }

    // Leetcode 9. Palindrome Number
    public static void test9() {
        Solution9 solution9 = new Solution9();
        int num = 49094;
        System.out.println("Is " + num + " a palindrome number?\n" + solution9.isPalindrome(num));
    }

    // Leetcode 101. Symmetric Tree
    public static void test101() {
        Integer[] testCase = { 1, 2, 2, 3, 4, 4, 3 };
        TreeNode root = TreeNode.buildTree(testCase);
        Solution101 solution101 = new Solution101();
        System.out.println("1. Recursive method: " + solution101.isSymmetric(root));
        System.out.println("2. Iterative method: " + solution101.isSymmetricIteration(root));
    }

    // Leetcode 104. Maximum Depth of Binary Tree
    public static void test104() {
        Integer[] testCase = { 3, 9, 20, null, null, 15, 7 };
        TreeNode root = TreeNode.buildTree(testCase);
        Solution104 solution104 = new Solution104();
        System.out.println("1. Max depth using recursion: " + solution104.maxDepth(root));
        System.out.println("2. Max depth using iteration: " + solution104.maxDepthIteration(root));
    }

    // Leetcode 118. Pascal's Triangle
    public static void test118() {
        Solution118 solution118 = new Solution118();
        int numRows = 5;
        System.out.println("Pascal's Triangle with " + numRows + " rows:");
        System.out.println(solution118.generate(numRows));
    }

    // Leetcode 292. Nim Game
    public static void test292() {
        Solution292 solution292 = new Solution292();
        int n = 4;
        System.out.println("Nim Game with " + n + " stones: " + solution292.canWinNim(n));
    }
}
