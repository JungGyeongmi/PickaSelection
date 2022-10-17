package com.funny.jam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.funny.jam.Entity.Music;

public interface MusicRepository extends JpaRepository<Music, Long> {
    
}
