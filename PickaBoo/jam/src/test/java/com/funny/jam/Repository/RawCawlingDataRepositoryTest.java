package com.funny.jam.Repository;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.funny.jam.entity.RawCrawlingEntity;
import com.funny.jam.repository.RawCawlingDataRepository;

@SpringBootTest
public class RawCawlingDataRepositoryTest {

    @Autowired
    RawCawlingDataRepository repository;

    @Test
    public void insertDummies() {
        IntStream.rangeClosed(0, 30).forEach(idx -> {
            RawCrawlingEntity rawEntity = RawCrawlingEntity.builder()
                    .seq(idx)
                    .siteLinkInfo("https://www." + idx + ".com")
                    .imageRemotPathInfo("C:\\TestCrawlingData\\Image")
                    .keywordInfo("테스트")
                    .build();

            repository.save(rawEntity);
        });

    }

    @Test
    void testGetRawCrawList() {

    }
}
