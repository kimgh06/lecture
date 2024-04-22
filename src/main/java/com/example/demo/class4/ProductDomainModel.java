package com.example.demo.class4;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

import java.time.LocalDateTime;

public class ProductDomainModel {
    @Nonnull
    private final Long id; // unique key 할 것임.
    @Nonnull
    private final String name;
    @Nonnull
    private final Integer price;
    @Nonnull
    private final LocalDateTime saleStartDateTime;
    @Nonnull
    private final LocalDateTime saleEndDateTime;

    public ProductDomainModel(Long id, String name, Integer price, LocalDateTime saleStartDateTime, LocalDateTime saleEndDateTime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.saleStartDateTime = saleStartDateTime;
        this.saleEndDateTime = saleEndDateTime;
    }

    @Nullable
    public Long getId() {
        return id;
    }
}
