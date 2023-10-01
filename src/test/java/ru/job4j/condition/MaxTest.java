package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int ecpected = 2;
        assertThat(result).isEqualTo(ecpected);
    }

    @Test
    void whenMax16To15Then16() {
        int left = 16;
        int right = 15;
        int result = Max.max(left, right);
        int expected = 16;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxMinus7ToMinus6ThenMinus6() {
        int left = -7;
        int right = -6;
        int result = Max.max(left, right);
        int expected = -6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To10Than10() {
        int left = 10;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}