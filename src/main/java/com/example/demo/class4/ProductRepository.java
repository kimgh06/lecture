package com.example.demo.class4;

import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@Repository
public class ProductRepository {
    private static long id = 0;
    private static final List<productDomainModel> PRODUCT_DOMAIN_MODELS = List.of(
            new productDomainModel(generateid(),"shampoo", 12000,
                    LocalDateTime.of(2024, Month.JANUARY, 20,0,0),
                    LocalDateTime.of(2024, Month.MAY, 20,0,0)
                    )
    );
    private static long generateid(){
        return ++id;
    }
    public List<productDomainModel> findAll(){
        return PRODUCT_DOMAIN_MODELS;
    }
    public productDomainModel findFirst(){
        return PRODUCT_DOMAIN_MODELS.get(0);
    }
}
