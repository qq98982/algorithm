package com.home.henry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ZeroMatrixTest {

    private static int[][] mat = { { 1, 2, 3, 4 }, { 5, 0, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

    @Test
    void zeroMatTest() {
        ZeroMatrix zeroMatrix = new ZeroMatrix();
        zeroMatrix.zeroMat(mat);
        Assertions.assertEquals(0, mat[1][3]);
        Assertions.assertEquals(0, mat[1][0]);
        Assertions.assertEquals(0, mat[2][1]);
        Assertions.assertEquals(0, mat[3][1]);
        zeroMatrix.displayMatrix(mat);
    }

}