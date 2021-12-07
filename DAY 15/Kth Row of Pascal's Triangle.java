// https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/



public class Solution {
    public int[] getRow(int A) {
        int[][] result = new int[A+1][];
        
        // initialize row 0 with [1]
        result[0] = new int[1];
        result[0][0] = 1;
        
        for (int row=1; row<A+1; row++) {
            result[row] = new int[row + 1];
            
            for (int col=0; col<=row; col++) {
                int left, right;
                
                // check if col and col-1 are in bounds
                
                if (col-1>=0 && col-1<row) {
                    left = result[row-1][col-1];
                }
                else {
                    left = 0;
                }
                
                // check if col and col-1 are in bounds
                
                if (col>=0 && col<row) {
                    right = result[row-1][col];
                }
                else {
                    right = 0;
                }
                
                result[row][col] = left + right;
            }
            
        }
        return result[A];
    }
}
