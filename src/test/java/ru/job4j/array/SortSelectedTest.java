package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSortFive() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortThree() {
        int[] data = new int[]{10, -18, 99};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-18, 10, 99};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortSeven() {
        int[] data = new int[]{2, 104, -1, -202, 567};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-202, -1, 2, 104, 567};
        assertThat(result).containsExactly(expected);
    }
}