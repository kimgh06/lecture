package com.example.demo.class5.service;

import com.example.demo.class5.domain.Board;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("dev")
class BoardServiceTest {

    @Autowired
    private BoardService boardService;


    @Test
    void getOneOfBoard() {
        final Board expected = new Board(1L, "Spring Boot Tutorial", "This is a tutorial about Spring Boot...");
        // assertThat.isEqualTo 로 비교시 기본적으로 refernce 까지 비교하므로, usingRecursiveComparison() 을 사용하여 필드값만 비교하도록 한다.
        assertThat(boardService.findByBoardId(1)).usingRecursiveComparison().isEqualTo(expected);
    }
}
