package com.funny.jam.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {

    private long bno;

    private String musicType;

    private String clothType;

    private String clothesPath;

    private String musicName;

    private List<String> hashTags;
}
