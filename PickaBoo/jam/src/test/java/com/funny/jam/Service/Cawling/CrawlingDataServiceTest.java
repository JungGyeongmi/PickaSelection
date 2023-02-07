package com.funny.jam.Service.Cawling;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.funny.jam.dto.RawCrawlingInfoDto;
import com.funny.jam.dto.ViewCrawlingDataDto;
import com.funny.jam.entity.RawCrawlingEntity;
import com.funny.jam.service.crawling.CrawlingDataService;
import com.funny.jam.service.crawling.SelectedCrawlingDataService;

import java.util.List;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
public class CrawlingDataServiceTest {

    @Autowired
    SelectedCrawlingDataService service;

    @Autowired
    CrawlingDataService rawservice;

    @Test
    void testGetViewCrawlingData() {
        List<ViewCrawlingDataDto> servicelist = service.getViewCrawlingData();
        log.info("=============TEST1====================");
        servicelist.forEach(i -> {
            log.info(i.toString());
        });

        log.info(servicelist.get(0).getClass());

        List<RawCrawlingInfoDto> servicelist2 = rawservice.getRawCrawlingData();
        log.info("=============TEST2====================");
        servicelist2.forEach(i -> {
            log.info(i.toString());
        });

        log.info(servicelist2.get(0).getClass());
    }
}
