package com.funny.jam.Service.board;

import java.util.ArrayList;
import java.util.List;

import com.funny.jam.DTO.BoardDto;
import com.funny.jam.Entity.Board;
import com.funny.jam.Entity.Types;

public interface BoardService {
    
    List<BoardDto> getBoardDetails();
    

    default BoardDto entityToDTO(Board boards) {


        List<List<Types>> HashTags = new ArrayList<List<Types>>();

        HashTags.add(boards.getClohtes().getHashtag());
        HashTags.add(boards.getMusic().getHashtag());

        BoardDto boardDTO = BoardDto.builder()
        .bno(boards.getBno())
        .musicType(boards.getMusic().getMusicType())
        .musicName(boards.getMusic().getMusicName())
        .clothType(boards.getClohtes().getClothType())
        .clothesPath(boards.getClohtes().getClothPath())
       // .hashTags(HashTags)
        .build();

        return boardDTO;
    }

}
