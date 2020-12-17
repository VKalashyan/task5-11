package ru.vsu.cs.kalashyan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);

        System.out.print("Height = ");
        int h = ask.nextInt();
        System.out.print("Weight = ");
        int w = ask.nextInt();

        drawPicture(h, w);
    }

    public static void drawPicture(int h, int w) {
        for (int i = 0; i < h; i++) {
            drawRow(w, i);
            System.out.println();
        }
    }

    public static void drawRow(int w, int i) {
        for (int j = 0; j < w - i; j++) {
            System.out.print(getSymbol(i, j));
        }
    }

    private static char getSymbol(int i, int j) {
        if (i % 2 == 0) {
            if (j % 2 == 0) {
                return 'a';
            } else {
                return 'b';
            }
        } else {
            if (j % 4 == 2 || j % 4 == 3) {
                return 'd';
            } else {
                return 'c';
            }
        }
    }
}