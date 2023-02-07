package com.funny.jam.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import com.funny.jam.Enum.ViewDataCategoryEnum;
import com.funny.jam.Enum.ViewDataStatusEnum;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "crawling_seq")
public class ViewCrawlingEntity implements Serializable {

    @Id
    private double image_index; // 인덱스(seq)
    private String image_Remote_path; // 이미지 경로 새로 저장경로 생성하고 넣어줌
    private String image_kyeword; // 키워드

    @ManyToOne(fetch = FetchType.LAZY) // join type lazy 지정 안할시 에러 - 빌드하면서 ㅇ동시생성 문제로 보임
    @JoinColumn(name = "seq")
    private RawCrawlingEntity crawling_seq;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ViewDataCategoryEnum image_category; // 카테고리

    @Column(nullable = false) // 길이 지정 안함
    @Enumerated(EnumType.STRING)
    private ViewDataStatusEnum imgae_status; // 사용 여부 상태 체크
}
