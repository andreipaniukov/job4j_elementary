package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != word[i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] array = new char[]{'П', 'р', 'и', 'в', 'е', 'т'};
        char[] part = new char[]{'П', 'р', 'и'};
        boolean rsl = ArrayChar.startsWith(array, part);
        System.out.println(rsl);
    }
}
