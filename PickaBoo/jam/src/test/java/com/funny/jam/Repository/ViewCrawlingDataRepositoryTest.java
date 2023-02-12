package com.funny.jam.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        String[] stArr = new String[] {
                "https://t1c.coupangcdn.com/thumbnails/remote/710x710ex/image/vendor_inventory/8c4b/7f6b4ab8292ca5dbb97645b3fef11503ca0b65f82ca056a078194ce50b38.jpg",
                "https://media.bunjang.co.kr/product/201794544_1_1665392662_w360.jpg",
                "https://cdn.imweb.me/thumbnail/20211105/16246701edcd5.jpg",
                "https://i3.codibook.net/files/197509082686/1af74f3bb8d797/717061543.jpg?class=big",
        };

        List<String> remotePathList = Arrays.asList(stArr);

        IntStream.rangeClosed(0, 3).forEach(idx -> {

            ViewCrawlingEntity viewEntity = ViewCrawlingEntity.builder()
                    .image_index(Long.valueOf(idx))
                    .image_Remote_path(remotePathList.get(idx))
                    .image_kyeword("TEST_KEYWORD" + idx)
                    .crawling_seq(RawCrawlingEntity.builder().seq(Long.valueOf(idx)).build())
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
