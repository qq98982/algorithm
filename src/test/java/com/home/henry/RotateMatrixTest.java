package com.home.henry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateMatrixTest {

    @Test
    void testRotateMatrix() {
        int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        RotateMatrix rotateMatrix = new RotateMatrix();
        rotateMatrix.displayMatrix(mat);
        rotateMatrix.rotateMatrix(mat);
        rotateMatrix.displayMatrix(mat);
        Assertions.assertEquals(7, mat[2][2]);
        Assertions.assertEquals(9, mat[0][1]);
        Assertions.assertEquals(10, mat[1][1]);
        Assertions.assertEquals(8, mat[3][2]);
        rotateMatrix.rotateMatrix(mat);
        Assertions.assertEquals(6, mat[2][2]);
        Assertions.assertEquals(15, mat[0][1]);
        Assertions.assertEquals(11, mat[1][1]);
        Assertions.assertEquals(2, mat[3][2]);
        rotateMatrix.displayMatrix(mat);
    }
}