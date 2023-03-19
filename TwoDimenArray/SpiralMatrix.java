package com.company.TwoDimenArray;

public class SpiralMatrix {
    public static void PrintSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startCol <= endCol && startRow <= endRow) {
//            Print TOP
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }

//            Print Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
//            Print Bottom
            for (int i = endCol - 1; i >= startRow; i--) {
//                we are adding this line to print a matrix of NxM
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][i] + " ");
            }
//            Print Left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
//             we are adding this line to print a matrix of NxM
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {7, 8, 9, 8},
                {1, 4, 5, 7},
                {7, 3, 2, 5},


        };
        PrintSpiral(matrix);

    }
}
