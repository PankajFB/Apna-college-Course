package com.company.TwoDimenArray;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 5},
                {5, 4, 6},
                {8, 7, 9}
        };
        System.out.println(PrintDiagonalSum(matrix));
    }

    private static int PrintDiagonalSum(int[][] matrix) {
//        we are using the most optimised way to find the
//        diagonal sum the time complexity for this approach is O(n)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
//            This is for the primary diagonal
            sum = sum + matrix[i][i];

//            now we are going to calculate the sum for the secondary diagonal
//            we use the condition because we have already calculated the == CASE above
            if (i != matrix.length - i - 1) {
                sum = sum + matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }
}
