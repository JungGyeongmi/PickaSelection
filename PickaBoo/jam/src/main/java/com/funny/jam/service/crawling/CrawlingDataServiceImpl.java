package com.funny.jam.service.crawling;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;
import com.funny.jam.dto.RawCrawlingInfoDto;
import com.funny.jam.repository.RawCawlingDataRepository;

import lombok.RequiredArgsConstructor;
// import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
// @Log4j2
public class CrawlingDataServiceImpl implements CrawlingDataService {

    @Autowired
    RawCawlingDataRepository repository;

    @Override
    public List<RawCrawlingInfoDto> getRawCrawlingData() {

        List<RawCrawlingInfoDto> list = new ArrayList<RawCrawlingInfoDto>();
        repository.getRawCrawList().forEach(entity -> {
            list.add(entityToDto(entity));
        });
        return list;
    }

}
