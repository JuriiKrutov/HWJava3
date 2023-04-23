import java.util.ArrayList;
import java.util.Random;

/*Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.*/
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String[] planet = new String[]{"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        fillPlanet(list, planet);
        System.out.println(list);
        printReplPlanet(planet, list);

        }
    static void fillPlanet(ArrayList<String> list, String[] planet){
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(planet[rnd.nextInt(8)]);
        }
    }
    static void printReplPlanet(String[] planet, ArrayList<String> list){
        int count;
        for (int i = 0; i < planet.length; i++) {
            count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (planet[i].equals(list.get(j))){
                    count++;
                }
            }
            System.out.println(planet[i] + " повторяется " + count + " раз");
        }
    }
}
