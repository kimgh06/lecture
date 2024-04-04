package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// @SpringBootApplication => springboot에서 지원하는 애노테이션이다.
// java annotation => 주석 정도.
// springboot 에서는 주석 정도의 annotation 을 => 기능 ??

// JAVA 애노테이션 프로세서
// 희성: 중복되는 코드 같은것들을 애노테이션 선언 만으로 "F/W 기능" 만들어준다.
// 강현: 메타데이터 관리를 해준다.
// 수희: 실행?
@SpringBootApplication
@Component
@Controller
@Service
@Repository
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// 요구사항
	// hello world
	// http://localhost:8080/hello url에 접속하면 화면에 helloworld 를 띄울 수 있도록 코딩해라.

	// Class -> ?
	// Controller Package 안에서 관리하고 싶어요.
	// 관심사의 집중 때문에.

	// Controller Class
	// hello 라는 endpoint(url)를 매핑할 클래스를 만들기 위해.

	// Class 에 들어가는 필드가 필요가 필요?

	// 기능 구현할 함수가 필요하다. => Method.
}
