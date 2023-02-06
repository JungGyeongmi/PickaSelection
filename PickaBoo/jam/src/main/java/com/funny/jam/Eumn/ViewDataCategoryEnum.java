package com.funny.jam.Eumn;

import com.funny.jam.Eumn.EnumFactory.EnumMapperType;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ViewDataCategoryEnum implements EnumMapperType {
    
    
    UNDECIDED("미정"),
    WORK("출근룩");

    @Getter
    private final String title;

    @Override
    public String getCode() 
    {
        return name();
    }   
}
