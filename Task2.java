/*Задан целочисленный список ArrayList.
Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = randList(10, 1, 10);
        System.out.println(list);
        System.out.println("Максимальное число: " + Collections.max(list));
        System.out.println("Минимальное число: " + Collections.min(list));
        arithmeticMean(list);
    }
    static List<Integer> randList(int size, int min, int max){
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(min, max+1));
        }
        return list;
    }
    static void arithmeticMean(List<Integer> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Среднее арифмитическое: " + sum / list.size());
    }

}
