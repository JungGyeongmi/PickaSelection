package com.funny.jam.Controller.boardPageController;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.funny.jam.DTO.BoardDto;
import com.funny.jam.Service.board.BoardService;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class BoardController {
    
    private final BoardService boardService;
    
    @GetMapping({ "/", "" })
    public String getBoardPage(Model model) {

        List<BoardDto> boardList = boardService.getBoardDetails();
        model.addAttribute("boardList", boardList);

        return "board";
    }

}
