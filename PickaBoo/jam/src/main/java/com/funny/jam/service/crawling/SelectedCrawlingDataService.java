package com.funny.jam.service.crawling;

import java.util.List;

import com.funny.jam.dto.ViewCrawlingDataDto;
import com.funny.jam.entity.ViewCrawlingEntity;

public interface SelectedCrawlingDataService {
    List<ViewCrawlingDataDto> getViewCrawlingData();

    default ViewCrawlingDataDto entityToDTO(ViewCrawlingEntity entity) {
        ViewCrawlingDataDto viewDto = ViewCrawlingDataDto.builder()
                .image_index(entity.getImage_index())
                .image_Remote_path(entity.getImage_Remote_path())
                .image_kyeword(entity.getImage_kyeword())
                .image_category(entity.getImage_category().getCode())
                .imgae_status(entity.getImgae_status().getCode())
                .build();
        return viewDto;
    }
}
