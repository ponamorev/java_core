package ru.penzgtu.ponamorev.java_core.chapter3;

// Вычислить расстояние, проходимое светом
// используя переменные типа long
public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // приблизительная скорость света, миль в секунду
        lightspeed = 186000;

        days = 1000; // указать количество дней

        seconds = 1000 * 24 * 60 * 60; // преобразовать в секунды

        distance = lightspeed * seconds; // вычислить расстояние

        System.out.print("За " + days);
        System.out.print(" дней свет пройдёт около ");
        System.out.println(distance + " миль..");
    }
}