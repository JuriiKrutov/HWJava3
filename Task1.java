import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Collections.list;

/*Пусть дан произвольный список целых чисел, удалить из него четные числа*/
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = randList(10, 1, 10);
        System.out.println(list);
        delEvenNumbers(list);
        System.out.println(list);
    }
    static List<Integer> randList(int size, int min, int max){
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(min, max+1));
        }
        return list;
    }
    static void delEvenNumbers(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
    }
}