package com.funny.jam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.funny.jam.Entity.Types;


public interface TypeRepository extends JpaRepository<Types, Long> {
    
}
