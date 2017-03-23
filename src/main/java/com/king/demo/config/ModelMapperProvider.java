package com.king.demo.config;

import com.king.demo.em.StatusEnum;
import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;

/**
 * Created by King on 2017/3/9.
 *
 * Entity 与 DTO 相互映射
 */

public class ModelMapperProvider {

    private static ModelMapper modelMapper;

    public static ModelMapper getModelMapper() {
        if(modelMapper == null) {
            modelMapper = new ModelMapper();

            // 状态枚举映射到Integer
            Converter<StatusEnum, Integer> statusEnumIntegerConverter = new AbstractConverter<StatusEnum, Integer>() {
                @Override
                protected Integer convert(StatusEnum statusEnum) {
                    return statusEnum.getValue();
                }
            };

            modelMapper.addConverter(statusEnumIntegerConverter);
        }

        return modelMapper;
    }

}
