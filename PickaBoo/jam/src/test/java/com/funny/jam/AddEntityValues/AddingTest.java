package com.funny.jam.AddEntityValues;

import static org.mockito.ArgumentMatchers.isNull;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.funny.jam.Entity.Clothes;
import com.funny.jam.Entity.HashID;
import com.funny.jam.Entity.HashTags;
import com.funny.jam.Entity.Music;
import com.funny.jam.Entity.Types;
import com.funny.jam.Repository.ClothesRepository;
import com.funny.jam.Repository.HashTagsRepository;
import com.funny.jam.Repository.MusicRepository;
import com.funny.jam.Repository.TypeRepository;

@SpringBootTest
public class AddingTest {
    

    @Autowired
    HashTagsRepository hashRepository;

    @Autowired
    ClothesRepository clothesRepository;

    @Autowired
    MusicRepository musicRepository;

    @Autowired
    TypeRepository typeRepository;


    // Add HashTags
    @Test
    void AddHashTagsTest () {

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
    void AddClothesTest() {

        Map<String, String[]> ht = new HashMap<String, String[]>();
        
        ht.put("상의", new String[] {"아우터", "셔츠", "니트" });

        String[] categories = {"데이트", "불금", "출근", "여행"};
        String[] tags = {"예쁨", "섹시", "멋짐", "고급"};

        IntStream.range(0, 10).forEach(i->{


            int idx = 0;
        

            HashTags hash = HashTags.builder()
                .category(categories[idx])
                .tag(tags[idx])
            .build();
            
             Clothes cloth = Clothes.builder()

            .clothName("clothesName"+i)
            .clothPath("clothesPath"+i)
            .clothType(ht.get("상의")[0])
            .clothPath("http://www.test"+i)
            .build();

            Music music = Music.builder()
            .musicName("musicName"+i)
            .musicPath("musicPath"+i)
            .musicType("TEST")
            .build();

            musicRepository.save(music);

            clothesRepository.save(cloth);
            
            Types type = Types.builder()
            .typeSeq(Long.valueOf(i))
            .cloth(cloth)
            .music(music)
            .hash(hash)
            .build();

            typeRepository.save(type);

        });

        
        IntStream.range(0, 10).forEach(i->{

           

        });
    }

    @Test
    void AddMusicTest() {

        IntStream.range(0, 10).forEach(i->{
            
          

        });
    }

    @Test
    void AddTypesTest() {

        IntStream.range(0, 10).forEach(i->{
            
           
        });

        
    }

    @Test
	public void testAll() {
		System.out.print(hashRepository.findAll().toString());
	}
}
