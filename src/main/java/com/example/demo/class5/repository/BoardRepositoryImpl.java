package com.example.demo.class5.repository;

import com.example.demo.class5.domain.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardRepositoryImpl implements BoardRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public Board findById(long id) {
        final String query = "select * from board where id = :id";

        final MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("id", id);

        return jdbcTemplate.queryForObject(
                query,
                parameterSource,
                (rs, rowNum) -> new Board(
                        rs.getLong("id"),
                        rs.getString("title"),
                        rs.getString("content")
                )
        );
    }
}
