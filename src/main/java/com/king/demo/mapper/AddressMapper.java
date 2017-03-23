package com.king.demo.mapper;

import com.king.demo.domain.entity.Address;
import com.king.demo.provider.AddressMapperSqlProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by King on 2017/3/10.
 */

@Mapper
public interface AddressMapper {

    int insert(Address address);

    Address getById(Long id);

}
