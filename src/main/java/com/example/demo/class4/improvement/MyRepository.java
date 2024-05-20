package com.example.demo.class4.improvement;

public interface MyRepository<ID, T> {
    T findById(ID id);
}
