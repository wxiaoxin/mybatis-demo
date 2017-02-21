package com.king.demo.repository;

import com.king.demo.domain.User;

/**
 * Created by Administrator on 2017/2/21.
 */
public interface UserRepository {

    User selectById(String id);

}
