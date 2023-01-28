package com.funny.jam.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RawCrawingInfoDto {
  private String siteLinkInfo;
  private String imageRemotPathInfo;
  private String keywordInfo; 
}
