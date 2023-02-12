package com.funny.jam.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.funny.jam.entity.ViewCrawlingEntity;

public interface ViewCrawlingDataRepository extends JpaRepository<ViewCrawlingEntity, Double> {

    @Query("SELECT view FROM ViewCrawlingEntity view")
    List<ViewCrawlingEntity> getViewDataList();

    /*
     * @Modifying
     * 
     * @Transactional
     * 
     * @Query("DELETE FROM ViewCrawlingEntity view WHERE view.RawCrawlingEntity.seq =:seq"
     * )
     * int deleteBySeq(Long seq);
     * 
     * 
     * @Modifying
     * 
     * @Query("DELETE FROM ViewCrawlingEntity view WHERE view.image_index =:index")
     * void deleteByIndex(Long index);
     * 
     * @Modifying
     * 
     * @Query("UPDATE ViewCrawlingEntity SET image_kyeword = :modiKeyword WHERE image_index =:index"
     * )
     * int ModifyImageKeyWord(String keyword, Long index);
     * 
     */
}
