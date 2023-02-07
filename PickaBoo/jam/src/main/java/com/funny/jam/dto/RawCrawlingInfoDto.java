package com.funny.jam.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RawCrawlingInfoDto {
  private String siteLinkInfo;
  private String imageRemotPathInfo;
  private String keywordInfo;
}
