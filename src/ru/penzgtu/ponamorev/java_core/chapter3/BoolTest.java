package ru.penzgtu.ponamorev.java_core.chapter3;

// Продемонстрировать применение значений типа boolean
public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        // значеине типа boolean может управлять оператором if
        if (b) System.out.println("Этот код выполняется");
        b = false;
        if (b) System.out.println("Этот код не выполняется");

        // результат сравнения - значение типа boolean
        System.out.println("10 > 9 равно " + (10 > 9));
    }
}