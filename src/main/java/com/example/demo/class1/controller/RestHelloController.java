package com.example.demo.class1.controller;

import com.example.demo.class1.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@link RestController} class
 * 여기서는 {@link Controller}와 {@link RestController}의 차이를 알 수 있다.
 * <p>
 * {@link RestController}를 간략히 설명해보자면, {@link Controller}와 {@link ResponseBody}를 합친 어노테이션이다.
 * <... 각자 공부하고 온 부분에 대해 발표하는 시간을 갖자 ...>
 */
@RestController
@RequiredArgsConstructor
public class RestHelloController {

    private final HelloService helloService;

    /**
     * 만약, {@link HelloController}에 {@code GET http://localhost:8080/hello} 라는 endpoint를 만들었다면, application 실행시 에러가 발생한다.
     * 이유가 뭘까? 하나의 application에서 동일한 path를 가진 endpoint가 2개 이상 존재할 수 없기 때문이다.
     * 그렇기에 {@link HelloController}를 주석 처리하든 해서, {@link RestHelloController}를 실행시키자.
     *
     * 이번에는 spring 핵심 기능인 {@link Autowired}를 사용했다.
     * {@link Autowired}는 spring에서 bean을 주입받는 방법 중 하나이다.
     *
     * {@link HelloService}는 {@link Service}라는 어노테이션을 사용했기 때문에, spring은 이를 bean으로 등록하고 관리한다.
     * 그렇기에 {@link Autowired}를 사용해서 주입받을 수 있는 것이다.
     */
    @RequestMapping(method = RequestMethod.GET, path = "hello")
    public String requestPrintHello() {
        return helloService.getHello();
    }
}
