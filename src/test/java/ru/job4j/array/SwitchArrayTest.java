package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {

    @Test
    void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3To6() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 3;
        int dest = 6;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 7, 5, 6, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap5To2() {
        int[] input = {29, 19, 3, 8, 11, 95, 100, 55};
        int source = 5;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {29, 19, 95, 8, 11, 3, 100, 55};
        assertThat(result).containsExactly(expected);
    }
}