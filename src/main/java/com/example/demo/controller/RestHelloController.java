package com.example.demo.controller;

import com.example.demo.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller 와 @RestController 차이를 알 수 있다.
 */
@RestController
@RequiredArgsConstructor
public class RestHelloController {

    private final HelloService helloService;

    /**
     * 하나의 application에서는 같은 url path + http method를 중복으로 선언 할 수 없다.
     */
    @RequestMapping(method = RequestMethod.GET, path = "hello")
    public String requestPrintHello() {
        return helloService.getHello();
    }
}
