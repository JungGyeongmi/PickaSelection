package com.funny.jam.Service.board;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funny.jam.DTO.BoardDto;
import com.funny.jam.Entity.Board;
import com.funny.jam.Repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    
    // @Autowired
    // @Modifying
    // @Transactional
    // @Override
    @Autowired
    private final BoardRepository boardRepository;


    @Override
    public List<BoardDto> getBoardDetails() {
        List<Board> result = boardRepository.getBoardList();

        return result.stream().map(entity -> entityToDTO(entity)).collect(Collectors.toList());
    }
}
