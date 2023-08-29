package seminar_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seminar4 {

    public static void main(String[] args) {

        // Задание №1  рекурсивные факториал и сумма
        System.out.println("_________  Задание №1  ___________________________________________");
        System.out.println(Seminar4.factorial(5));
        System.out.println(Seminar4.summary(7));

        // Задание №2 Фибоначчи
        System.out.println("_________  Задание №2  ___________________________________________");
        System.out.println(Seminar4.fibonacci(8));

        // Задание №3
        // Функции-редуцеры для списков: Напишите функцию-редуктор, которая принимает
        // список строк и возвращает строку, состоящую из объединенных элементов
        // списка через запятую. Например, для списка ["apple", "banana", "cherry"]
        // результат должен быть "apple, banana, cherry".
        System.out.println("_________  Задание №3  ___________________________________________");
        List<String> list = Arrays.asList("apple", "banana", "cherry", "orange");
        System.out.println(list);
        System.out.println(Seminar4.reducer(list));


        // Задание №4
        // Чистые функции и неизменяемость данных: Напишите функцию, которая принимает
        // список чисел и возвращает новый список, в котором каждый элемент умножен на 2.
        // Убедитесь, что вы используете только чистые функции и не изменяете исходный список.
        int[] array = {2,15,21,32,7,9,-3,11,6};
        System.out.println("_________  Задание №4  ___________________________________________");
        System.out.println("Исходный массив:    " + Arrays.toString(array));
        System.out.println("Производный массив: " + Arrays.toString(doubleIncrease(array)));
        System.out.println("Исходный массив:    " + Arrays.toString(array));

    }

    public static int factorial(int number){
        if (number == 1){
            return number;
        } else {
            return number*factorial(number-1);
        }
    }

    public static int summary(int number){
        if (number == 1){
            return number;
        } else {
            return number+summary(number-1);
        }
    }

    public static int fibonacci(int index){
        if (index == 1 || index == 0){
            return index;
        } else {
            return fibonacci(index-1)+fibonacci(index-2);
        }
    }

    public static String reducer(List<String> list){
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i) + ", ";
        }
        return result.substring(0, result.length()-2);
    }

    public static int[] doubleIncrease(int[] arr){
        int[] result = new int[arr.length];
        int idx = 0;
        for (int i:arr) {
            result[idx] = i*2; idx++;
        }
        return result;
    }

}
