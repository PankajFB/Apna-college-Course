package com.company.TwoDimenArray;

import java.util.Scanner;

public class CreationOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int n = matrix.length, m= matrix[0].length;
        System.out.println(n);
        System.out.println(m);
        Scanner sc=  new Scanner(System.in);

//        Taking inputs inside the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

//        now we will print the matrix using the same for loop as we have used above
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}
