package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] Q = new int[7][6];
        initArray(Q);
        printArray(Q);
        int [] value = processArray(Q);
        System.out.println();
        printArray(Q);
        System.out.println("\nsum = " + value[1]);
        System.out.println("counter = " + value[0] + "\n");
        sortByFirstRow(Q);
        sortBySecondAndThirdRows(Q);
        printArray(Q);
    }

    public static int[] processArray(int[][] Q) {
        int[] result = new int[2];
        for (int i = 0; i < Q.length; i++) {
            for (int j = 0; j < Q[i].length; j++) {
                if (Q[i][j] % 2 == 0 && (i + j) % 8 != 0) {
                    result[0]++;
                    result[1] += Q[i][j];
                    Q[i][j] = 0;
                }
            }
        }
        return result;
    }

    public static void swapColumns(int[][] Q, int j) {
        for (int k = 0; k < Q.length; k++) {
            int temp = Q[k][j];
            Q[k][j] = Q[k][j + 1];
            Q[k][j + 1] = temp;
        }
    }

    public static void sortByFirstRow(int[][] Q) {
        for (int i = 0; i < Q[0].length - 1; i++) {
            for (int j = 0; j < Q[0].length - i - 1; j++) {
                if (Q[0][j] < Q[0][j + 1]) {
                    swapColumns(Q, j);
                }
            }
        }
    }

    public static void sortBySecondAndThirdRows(int[][] Q) {
        for (int i = 0; i < Q[0].length - 1; i++) {
            for (int j = 0; j < Q[0].length - i - 1; j++) {
                if (Q[0][j] == Q[0][j + 1]) {
                    if (Q[1][j] > Q[1][j + 1]) {
                        swapColumns(Q, j);
                    } else if (Q[1][j] == Q[1][j + 1]) {
                        if (Q[2][j] > Q[2][j + 1]) {
                            swapColumns(Q, j);
                        }
                    }
                }
            }
        }
    }

    public static void printArray(int[][] Q) {
        for (int i = 0; i < Q.length; i++) {
            for (int j = 0; j < Q[i].length; j++) {
                System.out.print(Q[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void initArray(int[][] Q) {
        Random rand = new Random();
        for (int i = 0; i < Q.length; i++) {
            for (int j = 0; j < Q[i].length; j++) {
                Q[i][j] = rand.nextInt(62) + 7;
            }
        }
    }
}