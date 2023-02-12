package com.funny.jam.controller.boardPageController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.funny.jam.service.crawling.CrawlingDataService;
import com.funny.jam.service.crawling.SelectedCrawlingDataService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final CrawlingDataService rawdataService;
    private final SelectedCrawlingDataService selectedService;

    @GetMapping({ "/", "" })
    public String getBoardPage(Model model) {
        model.addAttribute("rawData", rawdataService.getRawCrawlingData());
        model.addAttribute("selectedData", selectedService.GetViewCrawlingData());
        return "board";
    }

}
