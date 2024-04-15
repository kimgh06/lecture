package com.example.demo.class3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonResponseController {

    @GetMapping(path = "/json")
    public GiveMeJson getMyJson() {
        return new GiveMeJson("Hello, World!");
    }

    /**
     * {@link JsonResponseController#getMyJson()} API의 Response Body 반환 객체이다.
     */
     static class GiveMeJson {
        private String content;

        /**
         * GiveMeJson을 {@link JsonResponseController}에서 response object로 사용하고 있다.
         * <p>
         * Spring Boot는 ResponseBody로 Java Type(Object)를 넘기면, Jackson 라이브러리를 사용하여 JSON으로 deserialize한다.
         * 이때, Jackson은 Java Type의 필드를 JSON Key로 사용하고, 필드의 값을 JSON Value로 사용한다.
         * <p>
         * IDE가 Getter 메소드에 대해 never used warning을 띄우는 경우가 있는데, 이는 IDE가 Getter 메소드가 사용되지 않는다고 판단하기 때문이다.
         * 하지만, Getter가 없는 필드에 대해서는 JSON deserialize 하지 않기 때문에 content 필드에 대한 Getter를 추가해야 한다.
         */
        public String getContent() {
            return content;
        }

        public GiveMeJson(String content) {
            this.content = content;
        }
    }
}
