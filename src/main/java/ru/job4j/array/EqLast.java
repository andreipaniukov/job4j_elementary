package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }

    public static void main(String[] args) {
        int[] num = new int[]{1, 6, 8, 15, 24};
        int[] num2 = new int[]{1, 36, 4, 24};
        boolean rsl = EqLast.check(num, num2);
        System.out.println(rsl);
    }
}
