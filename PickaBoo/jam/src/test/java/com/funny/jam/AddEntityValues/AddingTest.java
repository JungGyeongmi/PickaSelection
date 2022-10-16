package com.funny.jam.AddEntityValues;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.funny.jam.Entity.HashTags;
import com.funny.jam.Repository.HashTagsRepository;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;


@Log4j2
@SpringBootTest
public class AddingTest {
    

    @Autowired
    HashTagsRepository hashRepository;


    // Add HashTags
    @Test
    void AddTest () {

        String[] categories = {"데이트", "불금", "출근", "여행"};
        String[] tags = {"예쁨", "섹시", "멋짐", "고급"};

         IntStream.rangeClosed(0, 3)
        .forEach(idx -> {
       

        for(int i = 0; i < categories.length; i++) {
                HashTags hash  = HashTags.builder()
                    .category(categories[i])
                    .tag(tags[idx])
                    .build();
                hashRepository.save(hash);
            }
        });
    }

    @Test
	public void testAll() {
		System.out.print(hashRepository.findAll().toString());
	}
}
