package hw3;

import java.util.*;

class Progr {

    private static void merge(ArrayList<Integer> arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();    // Создаем временный массив
        int left = low;    // стартовый индекс левой части массива
        int right = mid + 1;    // стартовый индекс правой части массива

        // пока не закончится левая или правая часть массива, складываем
        // элементы во временный массив в отсортированном виде:

        while (left <= mid && right <= high) {
            if (arr.get(left) <= arr.get(right)) {
                temp.add(arr.get(left));
                left++;
            } else {
                temp.add(arr.get(right));
                right++;
            }
        }

        // если после сортировки остались элементы в левой части
        // изначального массива, складываем их в конец временного массива:

        while (left <= mid) {
            temp.add(arr.get(left));
            left++;
        }

        // если после сортировки остались элементы в правой части
        // изначального массива, складываем их в конец временного массива:

        while (right <= high) {
            temp.add(arr.get(right));
            right++;
        }

        // перемещаем все элементы из временного массива в изначальный:

        for (int i = low; i <= high; i++) {
            arr.set(i, temp.get(i - low));
        }
    }

    private static void mergeSort(ArrayList<Integer> arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;    // находим середину массива
        mergeSort(arr, low, mid);    // рекурсивно вызываем метод применительно к левой части массива
        mergeSort(arr, mid + 1, high);    // рекурсивно вызываем метод применительно к правой части массива
        merge(arr, low, mid, high);    // склеиваем левую и правую часть в отсортированном виде
    }

    private static List<Integer> delEven(ArrayList<Integer> arr){
        ArrayList<Integer> new_arr = new ArrayList<>();    // создаём новый массив
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) % 2 != 0){    // проверяем каждый элемент на нечётность
                new_arr.add(arr.get(i));    // если элемент оказался нечётным, добавляем его в новый массив
            }
        }
        return new_arr;    // возвращаем новый массив
    }

    private static List<Integer> findMinMaxMid(ArrayList<Integer> arr){
        ArrayList<Integer> new_arr = new ArrayList<>(3); // создаём новый массив объёмом 3 элемента
        int min = arr.get(0);    // объявляем первый элемент входного массива за минимум
        int max = arr.get(0);    // объявляем первый элемент входного массива за максимум

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i + 1) < min){
                min = arr.get(i + 1);    // если очередной элемент массива меньше min, перезаписываем его в min
            }
            if (arr.get(i + 1) > max){
                max = arr.get(i + 1);    // если очередной элемент массива больше max, перезаписываем его в max
            }
        }
        new_arr.add(min);
        new_arr.add(max);    // добавляем найденные минимум и максимум в новый массив
        int mid = (max + min) / 2;    // присваеваем переменной mid значение, равное среднему между min и max
        boolean flag = true;
        int n = 0;
        while (flag){
            for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i) == (mid - n) || arr.get(i) == (mid + n)){    // ищем наиболее близкий к mid элемент
                    mid = arr.get(i);    // когда находим, перезаписываем его в переменную mid
                    flag = false;
                }
            }
            n++;
        }
        new_arr.add(mid);    // добавляем найденный mid в новый массив

        return new_arr;    // возвращаем новый массив, содержащий min, max и mid
    }

    public static void main(String[] args) {

        // Задача 1. Реализовать алгоритм сортировки слиянием

//        int capacity = 15;
//        Random random = new Random();
//        ArrayList<Integer> arr = new ArrayList<>(capacity);
//        for (int i = 0; i < capacity; i++) {
//            arr.add(random.nextInt(21));
//        }
//
//        System.out.println("Not sorted array: ");
//        System.out.println(arr);
//        System.out.println();
//        System.out.println("Sorted array: ");
//        mergeSort(arr, 0, capacity - 1);
//        System.out.println(arr);

        ////////////////////////////////////////////////////////////

        // Задача 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа

//        int capacity = 15;
//        Random random = new Random();
//        ArrayList<Integer> arr = new ArrayList<>(capacity);
//        for (int i = 0; i < capacity; i++) {
//            arr.add(random.nextInt(21));
//        }
//
//        System.out.println("Init array: ");
//        System.out.println(arr);
//        System.out.println();
//        System.out.println("Array without even numbers: ");
//        System.out.println(delEven(arr));

        ////////////////////////////////////////////////////////////

        // Задача 3. Задан целочисленный список ArrayList. Найти минимальное,
        // максимальное и среднее из этого списка.

//        int capacity = 15;
//        Random random = new Random();
//        ArrayList<Integer> arr = new ArrayList<>(capacity);
//        for (int i = 0; i < capacity; i++) {
//            arr.add(random.nextInt(21));
//        }
//
//        System.out.println("Init array: ");
//        System.out.println(arr);
//        System.out.println();
//        System.out.print("Smallest element: ");
//        System.out.println(findMinMaxMid(arr).get(0));
//        System.out.print("Biggest element: ");
//        System.out.println(findMinMaxMid(arr).get(1));
//        System.out.print("Middle element: ");
//        System.out.println(findMinMaxMid(arr).get(2));

    }
}
