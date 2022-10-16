package com.funny.jam.Controller.Scheduler;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


public class CrawlingController {
    
    // 1. QuantDataController.java, CompanyDetailController.java 
    //2, 5, 7, 11월에 새벽0시 30분
    @Scheduled(cron = "0 30 0 * 2,5,7,11 *", zone = "Asia/Seoul")
    public ResponseEntity<String> bulkUpdate1() throws JsonParseException, JsonMappingException, IOException {
        //해당 Logic...

        return new ResponseEntity<String>(null);
    }

    // 2. DailyPriceController.java
    @Scheduled(cron = "0 30 16 * * 1-5", zone = "Asia/Seoul")
    public ResponseEntity<String> bulkUpdate2() throws JsonParseException, JsonMappingException, IOException {
        //해당 Logic...
        return new ResponseEntity<String>(null);
    }

}
