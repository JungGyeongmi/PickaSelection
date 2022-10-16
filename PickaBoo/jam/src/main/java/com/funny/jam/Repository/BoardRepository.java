package com.funny.jam.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.funny.jam.Entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
    
    @Query("SELECT b FROM Board b")
    List<Board> getBoardList();
}
