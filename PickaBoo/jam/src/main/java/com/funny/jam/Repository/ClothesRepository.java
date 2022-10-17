package com.funny.jam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.funny.jam.Entity.Clothes;

public interface ClothesRepository extends JpaRepository<Clothes, Long> {
    
}
