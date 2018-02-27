package com.home.henry;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is 4
 * bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 * Note: it is not easy to figure out start, last, offset......
 */
public class RotateMatrix {
    int[][] rotateMatrix(int mat[][]) {
        if (mat.length == 0 || mat.length != mat[0].length) {
            return mat;
        }
        int n = mat.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - layer - 1;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = mat[first][i];
                // left -> top
                mat[first][i] = mat[last - offset][first];
                // bottom -> left
                mat[last - offset][first] = mat[last][last - offset];
                // right -> bottom
                mat[last][last - offset] = mat[i][last];
                // top -> right
                mat[i][last] = top;
            }
        }
        return mat;
    }

    void displayMatrix(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("  " + mat[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
