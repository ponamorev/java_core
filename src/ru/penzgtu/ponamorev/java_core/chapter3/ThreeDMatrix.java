package ru.penzgtu.ponamorev.java_core.chapter3;

// Продемонстрировать применение трехмерного массива
public class ThreeDMatrix {
    public static void main(String[] args) {
        int threeD[][][] = new int[3][4][5];
        int i, j, k;
        for (i = 0; i < threeD.length; i++)
            for (j = 0; j < threeD[i].length; j++)
                for (k = 0; k < threeD[i][j].length; k++)
                    threeD[i][j][k] = i * j * k;

        for (i = 0; i < threeD.length; i++) {
            for (j = 0; j < threeD[i].length; j++) {
                for (k = 0; k < threeD[i][j].length; k++)
                    System.out.print(threeD[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}