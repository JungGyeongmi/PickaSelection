package com.funny.jam.Eumn;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EnumMapperFactory 
{
    /* https://mangkyu.tistory.com/74 */
    // 다양한 종류의 Enum을 생성 및 관리하는 factory
    private Map<String, List<EnumMapperValue>> factory;

    // 새로운 Enum 종류를 추가하는 함수
    public void put(String key, Class<? extends ViewDataStatusEnumMapperType> target) {
        factory.put(key, toEnumValues(target));
    }

    // 특정 Enum의 항목들을 조회하는 함수
    public List<EnumMapperValue> get(String key) {
        return factory.get(key);
    }

    // Enum의 내용들을 List로 바꾸어주는 함수
    private List<EnumMapperValue> toEnumValues(Class<? extends ViewDataStatusEnumMapperType> target) {
        return Arrays.stream(target.getEnumConstants())
            .map(EnumMapperValue::new)
            .collect(Collectors.toList());
    }
}
