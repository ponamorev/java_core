package ru.penzgtu.ponamorev.java_core.chapter3;

// Продемонстрировать применение двухмерного массива
public class TwoDArray {
    public static void main(String[] args) {
        int twoD[][] = new int[4][5];
        int i, j, k = 0;

        for (i = 0; i < twoD.length; i++)
            for (j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = k;
                k++;
            }

        System.out.println("| - - - - - - - - - -|");
        for (i = 0; i < twoD.length; i++) {
            System.out.print("|");
            for (j = 0; j < twoD[i].length; j++)
                if (i == 0 || i == 1) {
                    System.out.print(" " + twoD[i][j] + "  ");
                }
                else System.out.print(" " + twoD[i][j] + " ");
            System.out.println("|");
            System.out.println("| - - - - - - - - - -|");
        }
    }
}