package com.funny.jam.Enum.enumfactory;

import java.util.LinkedHashMap;

import org.springframework.context.annotation.Bean;

import com.funny.jam.Enum.ViewDataStatusEnum;

public class EnumMapper {

    @Bean
    public EnumMapperFactory createEnumMapperFactory() {
        EnumMapperFactory enumMapperFactory = new EnumMapperFactory(new LinkedHashMap<>());
        /* 생성한 Enum Status를 아래와 같이 Factory에 등록 */
        enumMapperFactory.put("ViewDataStatusEnum", ViewDataStatusEnum.class);

        return enumMapperFactory;
    }
}
