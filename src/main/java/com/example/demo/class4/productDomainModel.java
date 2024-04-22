package com.example.demo.class4;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

import java.time.LocalDateTime;

public class productDomainModel {
    @Nonnull
    private Long id; // unique key
    @Nonnull
    private  String name;
    @Nonnull
    private Integer price;
    @Nonnull
    private LocalDateTime saleStartDate;
    @Nonnull
    private LocalDateTime saleEndDate;
//    private Long memberId;

    public productDomainModel(Long id, String name, Integer price, LocalDateTime saleStartDate, LocalDateTime saleEndDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.saleStartDate = saleStartDate;
        this.saleEndDate = saleEndDate;
//        this.memberId = memberId;
    }
    @Nullable
    public Long getId(){
        return this.id;
    }
}
