package com.funny.jam.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.funny.jam.Entity.RawCrawlingEntity;

public interface RawCawlingDataRepository extends JpaRepository<RawCrawlingEntity, Double> 
{
    @Query("SELECT raw FROM RawCrawlingEntity raw")
    List<Object> getRawCrawList();
}
