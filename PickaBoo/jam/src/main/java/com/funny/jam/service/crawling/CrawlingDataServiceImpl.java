package com.funny.jam.service.crawling;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funny.jam.dto.RawCrawlingInfoDto;
import com.funny.jam.repository.RawCawlingDataRepository;
import com.funny.jam.repository.ViewCrawlingDataRepository;

import lombok.RequiredArgsConstructor;
// import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
// @Log4j2
public class CrawlingDataServiceImpl implements CrawlingDataService {

    @Autowired
    RawCawlingDataRepository repository;
    @Autowired
    ViewCrawlingDataRepository viewRepository;

    @Override
    public List<RawCrawlingInfoDto> getRawCrawlingData() {

        List<RawCrawlingInfoDto> list = new ArrayList<RawCrawlingInfoDto>();
        repository.getRawCrawList().forEach(entity -> {
            list.add(entityToDto(entity));
        });
        return list;
    }

    @Override
    public void removeRawWithView(long seq) {

        if (viewRepository.deleteBySeq(seq)) { // 연결 삭제
            repository.deleteBySeq(seq); // 본체 삭제
        }
    }

}
