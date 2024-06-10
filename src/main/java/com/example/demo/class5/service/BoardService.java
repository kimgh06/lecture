package com.example.demo.class5.service;

import com.example.demo.class5.domain.Board;
import com.example.demo.class5.repository.BoardRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private BoardRepositoryImpl boardRepository;

    @Transactional(readOnly = true)
    public Board findByBoardId(long boardId) {
        return boardRepository.findById(boardId);
    }
}
