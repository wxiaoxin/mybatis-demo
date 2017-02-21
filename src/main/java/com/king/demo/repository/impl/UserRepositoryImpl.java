package com.king.demo.repository.impl;

import com.king.demo.domain.User;
import com.king.demo.repository.UserRepository;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/2/21.
 */

@Repository
public class UserRepositoryImpl implements UserRepository {


    @Override
    public User selectById(String id) {
        return null;
    }
}
