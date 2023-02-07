package com.funny.jam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.funny.jam.dto.ViewCrawlingDataDto;
import com.funny.jam.entity.ViewCrawlingEntity;

public interface ViewCrawlingDataRepository extends JpaRepository<ViewCrawlingEntity, Double> {
    @Query("SELECT view FROM ViewCrawlingEntity view")
    List<ViewCrawlingEntity> getViewDataList();
}
