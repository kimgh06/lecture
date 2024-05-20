package com.example.demo.class4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @DisplayName("Product를 모두 조회할 때 결과로 1개만 반환될거야.")
    @Test
    public void findAllTest() {
        List<ProductDomainModel> products = productRepository.findAll();
        assertThat(products.size()).isEqualTo(1);
    }

    @DisplayName("첫번째 product를 가져오면 productId는 1일거야.")
    @Test
    public void firstProductIdIsWillBeOne() {
        ProductDomainModel firstProduct = productRepository.findFirst();
        assertThat(firstProduct.getId()).isEqualTo(1);
    }
}
