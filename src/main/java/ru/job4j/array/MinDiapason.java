package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] num = new int[]{7, 6, 8, 19, 22, 4, 3, 100, 2};
        int first = 2;
        int last = 7;
        int rsl = MinDiapason.findMin(num, first, last);
        System.out.println(rsl);
    }
}
