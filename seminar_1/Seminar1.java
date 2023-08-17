package seminar_1;

import java.util.*;

public class Seminar1 {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("---- Задача №1 ----------------------------------------------------------");
        Seminar1.sumEvenNumbers(8);

        //Задача 2
        System.out.println("---- Задача №2 ----------------------------------------------------------");
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random rdm = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(rdm.nextInt(-100, 100));
        }
        Seminar1.findLowestNumber(arrayList);

        //Задача 3
        System.out.println("---- Задача №3 ----------------------------------------------------------");
        System.out.println(Seminar1.factorial(6));

        //Задача 4
        System.out.println("---- Задача №4 ----------------------------------------------------------");
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(2,2,1,3,5,8,77,9,15,77));
        Seminar1.uniqSet(arrList);


    }

    //Задача 1: Подсчет суммы четных чисел от 1 до N. Напишите программу,
    // используя цикл, которая находит сумму всех четных чисел в диапазоне
    // от 1 до заданного числа N.
    public static void sumEvenNumbers(int number){
        int idx = 1;
        int sum = 0;
        while (idx <= number){
            if (idx % 2 == 0) {
                sum += idx;
            }
            idx++;
        }
        System.out.println(sum);
    }


    // Задача 2: Поиск наименьшего числа в списке. Напишите программу,
    // которая находит наименьшее число в заданном списке с помощью цикла.
    public static void findLowestNumber(List<Integer> listObj){
        int lowestNumber = listObj.get(0);
        int idx = 1;
        while (idx < listObj.size()){
            if (listObj.get(idx) < lowestNumber){
                lowestNumber = listObj.get(idx);
            }
            idx++;
        }
        System.out.println(listObj);
        System.out.println(lowestNumber);
    }


    // Задача 3: Вычисление факториала числа. Напишите программу, которая находит
    // факториал заданного числа N с использованием рекурсии или встроенных функций.
    public static int factorial(int number){
        if (number == 1) {
            return number;
        } else {
            return number*factorial(number-1);
        }
    }


    // Задача 4: Поиск уникальных элементов в списке. Напишите программу, которая
    // создает новый список, содержащий только уникальные элементы из исходного списка.
    public static void uniqSet(List<Integer> list){
        Set<Integer> integerSet = new HashSet<>();
        integerSet.addAll(list);
        System.out.println("Исходный   список: " + list);
        System.out.println("Уникальный список: " + integerSet);
    }

}
