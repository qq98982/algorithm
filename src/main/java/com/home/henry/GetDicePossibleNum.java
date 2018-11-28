package com.home.henry;

import java.math.BigInteger;

public class GetDicePossibleNum {
    public static BigInteger getNum(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Please input positive number");
        }
        BigInteger sum = BigInteger.ZERO;
        if (num == 0 || num == 1) {
            return BigInteger.ONE;
        }
        if (num == 2) {
            return getNum(0).add(getNum(1));
        }
        if (num == 3) {
            return getNum(0).add(getNum(1).add(getNum(2)));
        }
        if (num == 4) {
            return getNum(0).add(getNum(1).add(getNum(2)).add(getNum(3)));
        }
        if (num == 5) {
            return getNum(0).add(getNum(1).add(getNum(2)).add(getNum(3)).add(getNum(4)));
        }

        if (num == 6) {
            return getNum(0).add(getNum(1).add(getNum(2)).add(getNum(3)).add(getNum(4))).add(getNum(5));
        }
        BigInteger f0 = BigInteger.valueOf(1);
        BigInteger f1 = BigInteger.valueOf(1);
        BigInteger f2 = f0.add(f1);
        BigInteger f3 = f0.add(f1).add(f2);
        BigInteger f4 = f0.add(f1).add(f2).add(f3);
        BigInteger f5 = f0.add(f1).add(f2).add(f3).add(f4);
        for (int i = 6; i <= num; ++i) {
            sum = f0.add(f1).add(f2).add(f3).add(f4).add(f5);
            f0 = f1;
            f1 = f2;
            f2 = f3;
            f3 = f4;
            f4 = f5;
            f5 = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(getNum(i) + " " + i);
        }
        System.out.println(getNum(1000));
    }

}
