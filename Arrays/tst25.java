package com.company.Arrays;

import java.util.Scanner;

public class tst25 {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter no of rows");
//        int rows = sc.nextInt();
//        System.out.println("Enter no of column");
//        int cols = sc.nextInt();
        int r = 0,c = 0;
//        int [][] array = new int[rows][cols];
//        for (int i = 0; i < rows; i++){
//            for (int j = 0; j < cols; j++){
//                array[i][j] = sc.nextInt();
//            }
//        }

        int[][] array2 = {
                {1, 2, 1},
                {0, 4, 3},
                {9, 7, 2}
        };
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (array2[i][j]==1){
//                    r=i;
//                    c=j;
                    for (int o = 0; o < 3; o++){
                        for (int p = 0; p < 3; p++){
                            array2[i][p]=1;
                        }
                    }
                    for (int o = 0; o < 3; o++){
                        for (int p = 0; p < 3; p++){
                            array2[p][j]=1;
                        }
                    }
//                    for (int p = 0; p < 3; p++){
//                        array2[p][j]=1;
//                    }
                }
            }
        }


        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
//                array[i][j] = sc.nextInt();
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

//        System.out.println();
    }
}
