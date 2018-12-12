import common.*;
import solution101to150.*;

public class Main {
    public static void main(String[] args) {
        test104();
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
}
