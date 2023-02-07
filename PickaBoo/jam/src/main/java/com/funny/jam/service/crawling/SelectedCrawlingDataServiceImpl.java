package com.funny.jam.service.crawling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funny.jam.dto.ViewCrawlingDataDto;
import com.funny.jam.repository.ViewCrawlingDataRepository;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SelectedCrawlingDataServiceImpl implements SelectedCrawlingDataService {

    @Autowired
    ViewCrawlingDataRepository viewCrawlingRepository;

    @Override
    public List<ViewCrawlingDataDto> getViewCrawlingData() {

        List<ViewCrawlingDataDto> viewList = new ArrayList<ViewCrawlingDataDto>();

        viewCrawlingRepository.getViewDataList().forEach(i -> {
            viewList.add(entityToDTO(i));
        });

        return viewList;
    }
}
