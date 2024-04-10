package com.example.demo.class3.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(JsonResponseController.class)
class JsonResponseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("GET /json 요청에 대한 테스트")
    void testGetMyJson() throws Exception {
        this.mockMvc.perform(get("/json"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"content\":\"Hello, World!\"}"));
    }
}
