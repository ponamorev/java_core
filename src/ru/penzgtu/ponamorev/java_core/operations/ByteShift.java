package ru.penzgtu.ponamorev.java_core.operations;

// Сдвиг влево значения типа short
public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Первоначальное значение a: " + a);
        System.out.println("i и b: " + i + " и " + b);
        System.out.println(Integer.toString(a, 2));
        System.out.println(Integer.toString(i, 2));
        System.out.println(Integer.toString(b, 2));
    }
}