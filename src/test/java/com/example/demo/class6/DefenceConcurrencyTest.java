package com.example.demo.class6;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@ActiveProfiles("dev")
class defenceConcurrencyTest {
    private final static String REQUEST_BY_A = "orderRequestByA";

    @Autowired
    private DefenceConcurrency defenceConcurrency;

    @Test
    void testConcurrency() {
        // Given
        doRequest(REQUEST_BY_A);
        String expected = "fail";

        // When
        String actual = doRequest(REQUEST_BY_A);

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    private String doRequest(String requestId) {
        return defenceConcurrency.doSomething(requestId);
    }
}
