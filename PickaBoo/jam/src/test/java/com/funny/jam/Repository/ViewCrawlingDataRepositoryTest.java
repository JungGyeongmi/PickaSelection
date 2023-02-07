package com.funny.jam.Repository;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.funny.jam.Enum.ViewDataCategoryEnum;
import com.funny.jam.Enum.ViewDataStatusEnum;
import com.funny.jam.entity.RawCrawlingEntity;
import com.funny.jam.entity.ViewCrawlingEntity;
import com.funny.jam.repository.ViewCrawlingDataRepository;

@SpringBootTest
public class ViewCrawlingDataRepositoryTest {

    @Autowired
    ViewCrawlingDataRepository repository;

    @Test
    public void insertDummies() {

        IntStream.rangeClosed(0, 30).forEach(idx -> {

            ViewCrawlingEntity viewEntity = ViewCrawlingEntity.builder()
                    .image_index(idx)
                    .image_Remote_path("C:\\TestCrawlingData\\Image")
                    .image_kyeword("TEST_KEYWORD" + idx)
                    .crawling_seq(RawCrawlingEntity.builder().seq(idx).build())
                    .image_category(ViewDataCategoryEnum.UNDECIDED)
                    .imgae_status(ViewDataStatusEnum.UNDECIDED)
                    .build();

            repository.save(viewEntity);
        });
    }

    @Test
    void testGetViewDataList() {

    }
}
