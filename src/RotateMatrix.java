
// Leetcode 48: The problem is to rotate the given matrix clockwise by 90 degrees

import java.util.Arrays;

public class RotateMatrix {
    
    public void rotateMatrix(int[][] matrix) {
        // If number of rows==0 or number of rows != number of columns, just return
        if(matrix.length == 0 || matrix.length != matrix[0].length) {
            return;
        }

        int left=0, right=matrix.length - 1;
        int top, bottom, topLeft;

        while(left < right) {
            top = left;
            bottom = right;

            for(int i=0; i< right-left; i++) {

                //Store top left in a temperory variable
                topLeft = matrix[top][left + i];

                // move bottom left to top left
                matrix[top][left + i] = matrix[bottom - i][left];

                // move bottom right to bottom left
                matrix[bottom - i][left] = matrix[bottom][right - i];

                // move top right to bottom right
                matrix[bottom][right - i] = matrix[top + i][right];

                // move temp variable value to top right
                matrix[top + i][right] = topLeft;
            }

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        RotateMatrix rm = new RotateMatrix();

        System.out.println("Original matrix: " + Arrays.deepToString(matrix));
        rm.rotateMatrix(matrix);

        System.out.println("Matrix after rotation: " + Arrays.deepToString(matrix));
    }
}
