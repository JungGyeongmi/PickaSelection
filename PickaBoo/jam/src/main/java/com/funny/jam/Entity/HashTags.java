package com.funny.jam.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@IdClass(HashID.class)
@Table(name = "hashTags")
public class HashTags {

    @Id
    @Column(name="category")
    private String category;
    
    @Id
    @Column(name="tag")
    private String tag;
    
}
