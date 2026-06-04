public class Solution {

    public int diagonalSum(int[][] matrix) {

        int size = matrix.length;
        int total = 0;

        for(int row = 0; row < size; row++) {

            total += matrix[row][row];

            total += matrix[row][size - row - 1];
        }

        // removing duplicate center element
        if(size % 2 == 1) {

            total -= matrix[size / 2][size / 2];
        }

        return total;
    }
}
