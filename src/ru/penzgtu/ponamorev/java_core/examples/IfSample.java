package ru.penzgtu.ponamorev.java_core.examples;

/*
    Продемонстрировать применение условного оператора if

    Просвоить исходному файлу имя "IfSample.java"
 */
public class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше y");

        x = x * 2;
        if (x == y) System.out.println("x теперь равно y");

        x = x * 2;
        if (x > y) System.out.println("x теперь больше y");

        // Этот опреатор не будет ничего выводить
        if (x == y) System.out.println("Вы не увидите этого");
    }
}