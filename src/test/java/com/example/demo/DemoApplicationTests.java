package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Collections;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Test
	@DisplayName("1+1")
	void contextLoads() {
		assertThat(1+2).isEqualTo(3);
	}

	@Test
	@DisplayName("list")
	void asdf(){
		List<String> list = List.of();
		assertThat(list).isEqualTo(Collections.emptyList());
	}

	@Test
	@DisplayName("length")
	void getLength(){
		String str = "asdf";
		assertThat(str.length()).isEqualTo(4);
	}

	@Test
	@DisplayName("get hello")
	void getHello(){
		String hell = "hell", o= "o";
		assertThat(hell+o).isEqualTo("hello");
	}

	@Test
	@DisplayName("is it string?")
	void isString(){
		Integer asdf = 4;
		assertThat(String.class.isInstance(asdf)).isFalse();
	}
}
