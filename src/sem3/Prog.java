package sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Prog {

    private static boolean isDigit(String str){
        int test;
        try{
            test = Integer.parseInt(str);
            return true;
        }
        catch (NumberFormatException ex){
            return false;
        }
    }

    public static void main(String[] args) {

//        Random coin = new Random();
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Maya");
//        list.add("Nataly");
//        list.add("Dmitry");
//        list.add("Anton");
//
//        int ind = coin.nextInt(2);
//
//        System.out.println(list.get(ind));

//        Задача 1. Заполнить список десятью случайными числами.
//        Отсортировать список методом sort() и вывести его на экран.

//        int capacity = 10;
//
//        ArrayList<Integer> array = new ArrayList<>(capacity);
//
//        Random rnd = new Random();
//
//        for (int i = 0; i < capacity; i++) {
//            array.add(rnd.nextInt(1, 11));
//        }
//        System.out.println(array);
//        Collections.sort(array);
//        System.out.println(array);


//        Задача 2. Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//        Вывести название каждой планеты и количество его повторений в списке.

//        int capacity = 21;
//
//        ArrayList<String> arr_planets = new ArrayList<>(capacity);
//
//        HashMap<Integer, String> planets = new HashMap<>();
//        planets.put(1, "Mercury");
//        planets.put(2, "Venus");
//        planets.put(3, "Earth");
//        planets.put(4, "Mars");
//        planets.put(5, "Jupiter");
//        planets.put(6, "Saturn");
//        planets.put(7, "Uran");
//        planets.put(8, "Neptune");
//        System.out.println(planets);
//
//        Random rand = new Random();
//
//
//        for (int i = 0; i < capacity; i++) {
//            int key = rand.nextInt(1, 9);
//            String planet = planets.get(key);
//            arr_planets.add(planet);
//        }
//
//        System.out.println(arr_planets);
//
//        HashMap<String, Integer> result = new HashMap<>();
//        int count = 0;
//
//        for (int i = 0; i < capacity - 1; i++) {
//            if(result.containsKey(arr_planets.get(i))){
//
//            }
//        }

//        Задача 3. Создать список типа ArrayList<String>.
//        Поместить в него как строки, так и целые числа.
//        Пройти по списку, найти и удалить целые числа.

        ArrayList<String> some_list = new ArrayList<>();

        some_list.add("trulala");
        some_list.add("3");
        some_list.add("opachki");
        some_list.add("hop_hey_lalaley");
        some_list.add("4");
        some_list.add("tratata");
        some_list.add("1");

        System.out.println(some_list);

        some_list.removeIf(Prog::isDigit);

        System.out.println(some_list);


    }
}
