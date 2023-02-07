package com.funny.jam.Enum;

import com.funny.jam.Enum.enumfactory.EnumMapperType;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ViewDataStatusEnum implements EnumMapperType {
    UNDECIDED("대기중"),
    CONFIRMED("선택");

    @Getter
    private final String title;

    @Override
    public String getCode() {
        return name();
    }
}
