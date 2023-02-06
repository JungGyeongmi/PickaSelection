package com.funny.jam.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ViewCrawingDataDto 
{ // 관리자 페이지에서 사용해야 할 부분
    private Double image_index; // 인덱스(seq)
    private String image_Remote_path; // 이미지 경로
    private String image_kyeword; // 키워드
    private String image_category; // 카테고리 -enum
    private String imgae_status; // 사용 여부 상태 체크 -enum
}
