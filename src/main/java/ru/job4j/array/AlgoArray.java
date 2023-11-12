package ru.job4j.array;

public class AlgoArray {

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        System.out.println(array[0]);
        for (int index = 1; index < array.length; index++) {
            int temp1 = array[index];
            int min = array[index];
            for (int num : array) {
                if (num < min && num > array[index - 1]) {
                    min = num;
                }
            }
            array[index] = min;
            System.out.println(array[index]);
            for (int i = 0; i < array.length; i++) {
                int num = array[i];
                if (temp1 > num && i > index) {
                    array[i] = temp1;
                }
            }
        }
    }
}
