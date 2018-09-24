package ru.penzgtu.ponamorev.java_core.operations;

// Применение сдвига влево в качестве быстрого способа умножения на 2
public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;

        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
            System.out.println(Integer.toString(num, 2));
        }
    }
}