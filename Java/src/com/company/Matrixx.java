package com.company;

import java.util.Scanner;

public class Matrixx {
    public static void main (String args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of lines of first matrix");
        int a = scn.nextInt();
        System.out.println("Enter the numbers of columns of first numbers and lines of second");
        int b = scn.nextInt();
        System.out.println("Enter the numbers of columns of second matrix");
        int c = scn.nextInt();
        int MatrixA[][] = new int[a][b];
        int MatrixB[][] = new int[b][c];
        int MatrixAB[][] = new int[a][c];
        System.out.println("Please, full the first matrix");
        for (int i = 0; i < a; i++) { // вводим данные первой матрицы
            for (int j = 0; j < b; j++) {
                MatrixA[i][j] = scn.nextInt();
            }
        }
        System.out.println("Please, full the first matrix");
        for (int i = 0; i < b; i++) { // вводим данные второй матрицы
            for (int j = 0; j < c; j++) {
                MatrixB[i][j] = scn.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int u = 0; u < c; u++) {
                for (int j = 0; j < b; j++) {
                    MatrixAB[i][u]+= MatrixA[i][j] * MatrixB[j][u];
                }
            }
        }
        for (int i = 0; i < a; i++) { // вывод третьей матрицы
            for (int j = 0; j < c; j++) {
                System.out.println(MatrixAB[i][j] + " ");
            }
            System.out.println();
        }
    }
}
