package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * {@link SpringBootApplication} => SpringBoot에서 지원하는 애노테이션은 무수히 많다.
 * Java 에서는 애노테이션이 {@code  @Override} 같은 것이였는데, Spring에서는 이러한 애노테이션을 확장해서 많은 것을 지원한다.
 * 대표적으로 {@link Component}, {@link Controller}, {@link Service}, {@link Repository} 등이 있다.
 * <p>
 * 학교에서 Java 애노테이션을 "주석" 정도로 배웠을텐데, Spring에서는 어떻게해서 애노테이션에 확장된 기능을 제공할 수 있었던걸까?
 * 바로 애노테이션 프로세서 라는 기술을 사용해서 Source-Code 상의 magic을 이루어낸다.
 * 그리고 애노테이션 프로세서라는 기술은 스프링을 구성하는데 핵심 기술임으로 알아두는것이 좋다.
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
