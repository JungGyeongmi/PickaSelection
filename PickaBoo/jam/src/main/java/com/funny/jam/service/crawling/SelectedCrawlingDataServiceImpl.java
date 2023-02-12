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
    ViewCrawlingDataRepository repositroy;

    @Override
    public List<ViewCrawlingDataDto> GetViewCrawlingData() {

        List<ViewCrawlingDataDto> viewList = new ArrayList<ViewCrawlingDataDto>();

        repositroy.getViewDataList().forEach(i -> {
            viewList.add(entityToDTO(i));
        });

        return viewList;
    }

    @Override
    public void DeleteViewItemWithIndex(Long index) {
        // repositroy.deleteByIndex(index);
    }

    @Override
    public void ModifyViewKeywordWithIndex(String modiStr, Long index) {
        // repositroy.ModifyImageKeyWord(modiStr, index);
    }
}
