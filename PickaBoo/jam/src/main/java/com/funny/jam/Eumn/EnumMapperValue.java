package com.funny.jam.Eumn;

import lombok.Getter;

@Getter
public class EnumMapperValue 
{
    private String code;
    private String title;

    public EnumMapperValue(ViewDataStatusEnumMapperType enumMapperType) 
    {
        code = enumMapperType.getCode(); // ViewDataStatusEnum 의 UNDECIDED 내지 CONFIRM 
        title = enumMapperType.getTitle();// ViewDataStatusEnum 의 대기중 내지 선택 
    }
}
