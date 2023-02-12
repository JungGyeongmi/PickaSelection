package com.funny.jam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RawCrawlingEntity {
    @Id
    private Long seq;
    private String siteLinkInfo;
    private String imageRemotPathInfo;
    private String keywordInfo;
}
