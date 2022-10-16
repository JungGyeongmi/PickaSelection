package com.funny.jam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.funny.jam.Entity.HashID;
import com.funny.jam.Entity.HashTags;

public interface HashTagsRepository extends JpaRepository<HashTags, HashID> {
    
}
