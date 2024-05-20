package com.example.demo.class5.domain;

import jakarta.annotation.Nonnull;


public class Board {
    @Nonnull
    private final Long id;

    @Nonnull
    private final String title;

    @Nonnull
    private final String content;

    public Board(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
