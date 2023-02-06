package com.funny.jam.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.funny.jam.Entity.ViewCrawlingEntity;

public interface ViewCrawlingDataRepository extends JpaRepository<ViewCrawlingEntity, Double> 
{
    @Query("SELECT view FROM ViewCrawlingEntity view")
    List<Object> getViewDataList();
}
