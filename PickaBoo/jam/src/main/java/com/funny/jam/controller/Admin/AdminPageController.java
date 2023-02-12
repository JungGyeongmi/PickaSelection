package com.funny.jam.controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.RequiredArgsConstructor;

import com.funny.jam.service.crawling.CrawlingDataService;
import com.funny.jam.service.crawling.SelectedCrawlingDataService;
import com.funny.jam.dto.RawCrawlingInfoDto;
import com.funny.jam.dto.ViewCrawlingDataDto;

@Controller
@RequiredArgsConstructor
public class AdminPageController {

    /*
     * private final CrawlingDataService crawlingService;
     * private final SelectedCrawlingDataService selectedService;
     * 
     * @PostMapping("/removeRawData")
     * public String RemoveRawCrawlingData(
     * RawCrawlingInfoDto rawdto, RedirectAttributes ra) {
     * 
     * // dto, RedirectAttributes ra // bool 넘겨주는걸로 변경해서 ra.addAttribute로 넘겨주기
     * // addFlashAttribute < URL 노출을 막음 이걸로 변경
     * crawlingService.removeRawWithView(rawdto.getSeq());
     * 
     * return "redirect:/";
     * }
     * 
     * @PostMapping("/removeViewData")
     * public String RemoveViewData(
     * ViewCrawlingDataDto viewdto, RedirectAttributes ra) {
     * 
     * // dto, RedirectAttributes ra // bool 넘겨주는걸로 변경해서 ra.addAttribute로 넘겨주기
     * // addFlashAttribute < URL 노출을 막음 이걸로 변경
     * selectedService.DeleteViewItemWithIndex(viewdto.getImage_index());
     * 
     * return "redirect:/";
     * }
     * 
     * @PostMapping("/modifyKeyword")
     * public String ModifyKeyWord(
     * ViewCrawlingDataDto viewdto, RedirectAttributes ra) {
     * 
     * // dto, RedirectAttributes ra // bool 넘겨주는걸로 변경해서 ra.addAttribute로 넘겨주기
     * // addFlashAttribute < URL 노출을 막음 이걸로 변경
     * selectedService.ModifyViewKeywordWithIndex(viewdto.getImage_kyeword(),
     * viewdto.getImage_index());
     * 
     * return "redirect:/";
     * }
     */

}
