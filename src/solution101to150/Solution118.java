package solution101to150;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Case 1: if numRows equals zero, then return zero rows.
        if (0 == numRows) {
            return triangle;
        }

        // Case 2: the first row is always [1].
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        // Case 3: if numRows > 1, calculate according to the previous row.
        for (int curRow = 1; curRow < numRows; curRow++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> preRow = triangle.get(curRow - 1);

            // The first element is 1.
            row.add(1);
            // DP: row[i][j] = row[i-1][j-1] + row[i-1][j]
            for (int j = 1; j < curRow; j++) {
                row.add(preRow.get(j-1) + preRow.get(j));
            }
            // The last element is 1.
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }

    public List<List<Integer>> generate_0ms(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> pre = new ArrayList<>();
        if(numRows == 0) return ans;
        pre.add(1);
        ans.add(pre);
        for(int i = 2;i <= numRows;i++){
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for(int j = 1;j < i-1;j++){
                cur.add(pre.get(j) + pre.get(j-1));
            }
            cur.add(1);
            ans.add(cur);
            pre = cur;
        }
        return ans;
    }
}
