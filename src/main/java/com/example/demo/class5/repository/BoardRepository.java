package com.example.demo.class5.repository;

import com.example.demo.class5.domain.Board;

public interface BoardRepository {
    Board findById(long id);
}
