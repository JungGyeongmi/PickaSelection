package com.funny.jam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.funny.jam.entity.RawCrawlingEntity;

public interface RawCawlingDataRepository extends JpaRepository<RawCrawlingEntity, Double> {
    @Query("SELECT raw FROM RawCrawlingEntity raw")
    List<RawCrawlingEntity> getRawCrawList();

    @Modifying
    @Query("delete from RawCrawlingEntity raw where raw.seq=:seq")
    void deleteBySeq(Long seq);
}
