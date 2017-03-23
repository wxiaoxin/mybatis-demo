package com.king.demo.service.impl;

import com.king.demo.config.ModelMapperProvider;
import com.king.demo.domain.dto.UserDTO;
import com.king.demo.domain.entity.User;
import com.king.demo.mapper.UserMapper;
import com.king.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by King on 2017/2/21.
 *
 * 用户服务实现类
 */

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer save(UserDTO userDTO) {
        User user = ModelMapperProvider.getModelMapper().map(userDTO, User.class);
        return userMapper.insert(user);
    }

    @Override
    public UserDTO getById(Long id) {
        User user = userMapper.getByIdWithAddress(id);
        return ModelMapperProvider.getModelMapper().map(user, UserDTO.class);
    }


}
