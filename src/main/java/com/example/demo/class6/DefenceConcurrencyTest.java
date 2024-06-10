package com.example.demo.class6;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@ActiveProfiles("dev")
class DefenceConcurrencyTest {

    @Autowired
    private DefenceConcurrency defenceConcurrency;

    @Test
    void testConcurrency() {
        String requestId = "orderRequestByA";
        defenceConcurrency.doSomething(requestId);

        assertThat(defenceConcurrency.doSomething(requestId)).isEqualTo("fail");
    }
}