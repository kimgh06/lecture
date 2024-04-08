package com.example.demo.class1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * {@link Controller} Class
 * hello 라는 endpoint(url)를 뚫기 위해 만들었다.
 * <p>
 * {@code hello}라는 코드를 찍기 위해서는 복잡한 연산이 필요하지 않음으로,
 * 다음과 같이 {@code return hello world}를 바로 반환하도록 코딩한다.
 * <p>
 * <요구사항>
 * 브라우저에 {@code http://localhost:8080/hello} 접속하면 화면에 helloworld 를 띄울 수 있도록 코딩해라.
 */
@Controller
public class HelloController {

    /**
     * POST {@code http://localhost:8080/hello}
     * <p>
     * 이와 같이 코딩했을때 문제는
     * 브라우저 url 창에 <a href="http://localhost:8080/hello">...</a> 를 입력하면 404 에러가 발생한다는 것이다.
     * <p>
     * 어떻게 해결할 수 있을까?
     * 1. HTTP method를 GET으로 변경한다.
     * ...
     * <p>
     * GET으로 변경했다, 그럼에도 불구하고 문제가 있자 않나?
     * 일단 이쯤하고 {@link RestHelloController}로 넘어가보자..
     *
     * @return "hello world"
     */
    @RequestMapping(method = RequestMethod.POST, path = "hello")
    public String requestPrintHello() {
        return "hello world";
    }
}
