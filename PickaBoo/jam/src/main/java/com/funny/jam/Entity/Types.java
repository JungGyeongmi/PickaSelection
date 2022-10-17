package com.funny.jam.Entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = {"hash", "music", "cloth"})
public class Types {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeSeq;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({@JoinColumn(name="tag")
    ,@JoinColumn(name="category")})
    private HashTags hash;

    @ManyToOne(fetch = FetchType.LAZY)
    private Music music;

    @ManyToOne(fetch = FetchType.LAZY)
    private Clothes cloth;
}
