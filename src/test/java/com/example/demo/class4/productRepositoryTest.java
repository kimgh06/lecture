package com.example.demo.class4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

@SpringBootTest
class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;
    @DisplayName("will return a list of one")
    @Test
    public void findAllTest(){
        List<productDomainModel> p = productRepository.findAll();
        assertThat(p.size()).isEqualTo(1);
    }
    @DisplayName("when i get first product and the product_id will be 1")
    @Test
    public void getProductId(){
        List<productDomainModel> p = productRepository.findAll();
        if (p.get(0) == null){
            fail("do not return null");
            return;
        }
        assertThat(p.get(0).getId()).isEqualTo(1);
    }
    @DisplayName("the product_id will be 1")
    @Test
    public void getOneId(){
        productDomainModel p = productRepository.findFirst();
        assertThat(p.getId()).isEqualTo(1);
    }
}