package com.example.demo.class5.service;

import com.example.demo.class5.domain.Board;
import com.example.demo.class5.repository.BoardRepositoryImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class BoardService {
    private final BoardRepositoryImpl boardRepository;

    @Transactional(readOnly = true)
    public Board findByBoardId(long boardId) {
        return boardRepository.findById(boardId);
    }
}
