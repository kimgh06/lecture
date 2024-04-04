package com.example.demo.controller;


// Controller Class
// hello 라는 endpoint(url)를 매핑할 클래스를 만들기 위해 만든다.

// "hello world 찍어야 해" <- service
// http://localhost:8080/hello url에 접속하면 화면에 helloworld 를 띄울 수 있도록 코딩해라.
// 기능 구현할 함수가 필요하다. => JAVA에서는 method라고 부르는 함수를 만든다.

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(method = RequestMethod.POST, path = "hello")
    public String requestPrintHello() {
        return "hello world";
    }
}
