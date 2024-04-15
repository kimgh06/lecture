package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
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
        List<String> list = getNullReferenceList();
        assertThrows(NullPointerException.class, () -> list.stream().mapToInt(Integer::parseInt).sum());
    }

    @Test
    @DisplayName("null-safe 하게 실행하기 위해 list를 java 8+ optional로 한번 검사한뒤 stream을 실행한다.")
    public void nullListWithOptionalWillNotThrowException() {
        List<String> list = getNullReferenceList();
        List<String> nullSafeList = Optional.ofNullable(list).orElse(Collections.emptyList());
        assertDoesNotThrow(() -> nullSafeList.stream().mapToInt(Integer::parseInt).sum());
    }

    private static List<String> getNullReferenceList() {
        return null;
    }

}
