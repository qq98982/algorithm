package com.home.henry;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 */
public class ZeroMatrix {

    /**
     * This solution need O(MN) space.
     */
    int[][] zeroMat(int[][] mat) {
        if (mat.length == 0 || mat[0].length == 0) {
            return mat;
        }
        int M = mat.length;
        int N = mat[0].length;
        boolean[] row = new boolean[mat.length];
        boolean[] column = new boolean[mat[0].length];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            if (row[i]) {
                nullRow(i, mat);
            }
        }

        for (int i = 0; i < column.length; i++) {
            if (row[i]) {
                nullColumn(i, mat);
            }
        }

        return mat;
    }

    private void nullRow(int row, int[][] mat) {
        for (int j = 0; j < mat[0].length; j++) {
            mat[row][j] = 0;
        }
    }

    private void nullColumn(int col, int[][] mat) {
        for (int j = 0; j < mat.length; j++) {
            mat[j][col] = 0;
        }
    }

    void displayMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("  " + mat[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }

}
