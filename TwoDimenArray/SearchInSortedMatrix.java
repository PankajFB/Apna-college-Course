package com.company.TwoDimenArray;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
//        we are writing the code for the row and column sorted matrix
//        this type of search is also called staircase search
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int find = 16;
        searchInMatrix(matrix, find);
    }

    private static void searchInMatrix(int[][] matrix, int target) {
// we will select the right top element to start the search
//        Time complexity is O(n+m)

        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Element found at index " + row + " " + col);
                return ;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Element not found");

    }
}
