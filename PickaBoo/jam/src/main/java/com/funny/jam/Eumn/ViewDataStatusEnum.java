package com.funny.jam.Eumn;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ViewDataStatusEnum implements ViewDataStatusEnumMapperType
{
    UNDECIDED("대기중"),
    CONFIRMED("선택");

    @Getter
    private final String title;

    @Override
    public String getCode() 
    {
        return name();
    }   
}
