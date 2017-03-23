package com.king.demo.service;

import com.king.demo.domain.dto.UserDTO;

/**
 * Created by King on 2017/2/21.
 *
 * 用户服务接口
 */

public interface UserService {

    Integer save(UserDTO userDTO);

    UserDTO getById(Long id);

}
