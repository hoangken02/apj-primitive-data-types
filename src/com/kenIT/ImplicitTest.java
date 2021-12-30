package com.kenIT;

public class ImplicitTest {
    public static void main(String[] args) {
        int a = 1;
        double b;
        b = a;
        System.out.println(b);

        char c = 'A';
        int d = 'c';
        char f = (char) d;
        System.out.println(d + "");
        System.out.println(f);
    }
}
