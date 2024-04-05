package com.example.demo.class1.service;

import org.springframework.stereotype.Service;

/**
 * {@link Service} Class
 * <p>
 * 무언가 "비즈니스 로직" 이라는 것을 처리하기 위해 만들어진 클래스이다.
 * "비즈니스 로직"은 간단히 말하자면, 어떠한 요구사항을 처리하는 로직"을 말한다.
 * <p>
 * 이건 Java 개념이다, 어떤 행위는 보통 Class의 Method로 구현되기 때문에, Method를 통해 비즈니스 로직을 처리한다.
 */
@Service
public class HelloService {
    /**
     * {@code hello} 라는 문자열을 반환하는 메소드
     * 여기서는 hello 라는 문자열을 반환하는 메소드를 만들었다.
     *
     * @return "hello"
     */
    public String getHello() {
        return "hello";
    }
}
