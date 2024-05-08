package com.example.demo.class4.improvement;

import org.springframework.stereotype.Repository;

@Repository
public class CarRepository implements MyRepository<Long, Car> {

    @Override
    public Car findById(Long aLong) {
        return null;
    }
}
