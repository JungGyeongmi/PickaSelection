package com.funny.jam.service.crawling;

import java.util.List;

import com.funny.jam.dto.RawCrawlingInfoDto;
import com.funny.jam.entity.RawCrawlingEntity;

public interface CrawlingDataService {
    List<RawCrawlingInfoDto> getRawCrawlingData();

    default RawCrawlingInfoDto entityToDto(RawCrawlingEntity entity) {
        return RawCrawlingInfoDto.builder()
                .siteLinkInfo(entity.getSiteLinkInfo())
                .imageRemotPathInfo(entity.getImageRemotPathInfo())
                .keywordInfo(entity.getKeywordInfo())
                .build();
    }
}
