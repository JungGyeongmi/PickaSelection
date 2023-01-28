package com.funny.jam.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ViewCrawingDataDto {
    private Double image_index; // 인덱스(seq)
    private String image_Remote_path; // 이미지 경로
    private String image_kyeword; // 키워드
    private String image_category; // 카테고리
    private String imgae_status; // 사용 여부 상태 체크
}
