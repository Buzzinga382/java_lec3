package lec3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        ArrayList<Integer> list3 = new ArrayList<>(10);
//        ArrayList<Integer> list4 = new ArrayList<>(list3);

//        int day = 29;
//        int month = 9;
//        int year = 1990;
//        Integer[] date = {day, month, year};
//        List<Integer> d = Arrays.asList(date);
//        System.out.println(d);

//        StringBuilder day = new StringBuilder("28");
//        StringBuilder month = new StringBuilder("9");
//        StringBuilder year = new StringBuilder("1990");
//        StringBuilder[] date = new StringBuilder[]{day, month, year};
//        List<StringBuilder> d = Arrays.asList(date);
//        System.out.println(d);
//        date[1] = new StringBuilder("09");
//        System.out.println(d);

        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list){
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()){
            System.out.println(col.next());
        }


    }
}
