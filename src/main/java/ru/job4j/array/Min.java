package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] num = new int[]{3, 4, 1, 5};
        int rsl = Min.findMin(num);
        System.out.println(rsl);
    }
}
