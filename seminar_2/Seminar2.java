package seminar_2;

import java.util.Arrays;

public class Seminar2 {
    public static void main(String[] args) {

// Задание №1
//  Создайте функцию, которая принимает двумерный массив (лабиринт)
//  и начальную и конечную точки. Функция должна возвращать путь от
//  начальной до конечной точки или сообщение, что путь невозможен.

        // лабиринт 5х5 вход-0,0 выход-4,4
        System.out.println("_____________ Задание №1 _______________________________________________");
        Task1 t1 = new Task1();
        t1.searchWayOut(5,5,0,0,4,4);
        System.out.println("\n");


// Задание №2
// Напишите функцию, которая принимает массив чисел и
// значение X. Функция должна возвращать массив подмассивов так,
// чтобы сумма чисел в каждом подмассиве была меньше или равна X.

        System.out.println("_____________ Задание №2 _______________________________________________");
        Task2 t2 = new Task2();
        Integer[][] arr = t2.arrayPartition(t2.createArray(21), 53);
        System.out.print("Массив массивов: ");
        for (Integer[] a: arr) {
            System.out.print(Arrays.toString(a) + "  ");
        }
        System.out.println("\n");

// Задание №3
// Напишите рекурсивную функцию для вычисления n-ного числа Фибоначчи.

        System.out.println("_____________ Задание №3 _______________________________________________");
        Task3 t3 = new Task3();
        System.out.println(t3.fibonacci(9));

    }

}
