package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JustTest {

    @Test
    @DisplayName("emptyList에 steam을 실행시켜도 null-safe 하게 동작한다.")
    public void test() {
        List<String> list = List.of();
        assertThat(list.stream().mapToInt(Integer::parseInt).sum()).isEqualTo(0);
    }

    @Test
    @DisplayName("null referenced list에 steam을 실행하면 NPE가 발생한다.")
    public void nullListStreamWillThrowException() {
        List<String> list = null;
        assertThrows(NullPointerException.class, () -> list.stream().mapToInt(Integer::parseInt).sum());
    }
}
