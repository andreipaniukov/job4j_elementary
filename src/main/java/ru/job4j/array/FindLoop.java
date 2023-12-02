package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rsl = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rsl = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 4, 9, 16};
        int number = 9;
        int result = FindLoop.indexOf(array, number);
        System.out.println(result);
        int first = 1;
        int last = 3;
        result = FindLoop.indexInRange(array, number, first, last);
        System.out.println(result);
    }
}