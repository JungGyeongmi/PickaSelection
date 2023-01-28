package com.funny.jam.Controller.boardPageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class BoardController {
    
//    private final BoardService boardService;
    
 /*
     @GetMapping({ "/", "" })
    public String getBoardPage(Model model) {

        List<BoardDto> boardList = boardService.getBoardDetails();
        model.addAttribute("boardList", boardList);

        return "board";
    }
 */

    @GetMapping({ "/", "" })
    public String getBoardPage()
    {
        return "board";
    }

}
