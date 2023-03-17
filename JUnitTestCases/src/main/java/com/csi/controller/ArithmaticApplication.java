package com.csi.controller;

public class ArithmaticApplication {

    public static int add(int n1, int n2) {
        return n1+n2;
    }

    public static int sub(int n1, int n2) {
        return n1-n2;
    }

    public static int mul(int n1, int n2) {
        return n1*n2;
    }

    public static int div(int n1, int n2) {
        return n1/n2;
    }

    public static void main(String[] args) {

        System.out.println("Addition Result:" + add(4,5));
        System.out.println("Substraction Result:" + add(10,5));
        System.out.println("Multiplication Result:" + add(4,5));
        System.out.println("Division Result:" + add(15,5));

    }
}
