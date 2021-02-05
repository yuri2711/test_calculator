package main;

import java.util.Scanner;

import lib.Number;
import lib.Math;

public class Main {
    public static void main(String[] args) {
        new Main().start();
    }

    private void start() {
        while (true) input();
    }

    private void input() {
        System.out.println("input:");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        Number num = new Math();
        System.out.println("output:");
        if (num.getNumber(result) < 999) System.out.println(num.getNumber(result));
    }
}
