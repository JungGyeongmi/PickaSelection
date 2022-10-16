package com.funny.jam.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
@ToString(exclude = { "hashtag" })
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long mno;

    private String musicName;
    private String musicPath;
    private String[] musicType;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Type> hashtag;
}
