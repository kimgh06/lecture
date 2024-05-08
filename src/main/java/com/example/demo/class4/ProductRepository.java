package com.example.demo.class4;

import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@Repository
public class ProductRepository {
    private static long START_PRODUCT_ID = 0;
    private static final List<ProductDomainModel> PRODUCT_DOMAIN_MODELS = List.of(
            new ProductDomainModel(
                    generateProductId(),
                    "아이폰 12 mini",
                    1109000,
                    LocalDateTime.of(2024, Month.JANUARY, 25, 0, 0),
                    LocalDateTime.of(2024, Month.APRIL, 22, 0, 0)
            )
    );

    private static long generateProductId() {
        return ++START_PRODUCT_ID;
    }

    public List<ProductDomainModel> findAll() {
        return PRODUCT_DOMAIN_MODELS;
    }

    public ProductDomainModel findFirst() {
        ProductDomainModel firstProduct = PRODUCT_DOMAIN_MODELS.get(0);
        if (firstProduct == null) {
            throw new IllegalStateException("findFirst() 수행했지만, 첫번째에 해당하는 product이 없습니다.");
        } else {
            return firstProduct;
        }
    }
}
