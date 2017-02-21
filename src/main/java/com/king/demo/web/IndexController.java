package com.king.demo.web;

import com.king.demo.domain.User;
import com.king.demo.mapper.UserMapper;
import com.king.demo.util.UUIDGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2017/2/21.
 */

@RestController
public class IndexController extends BaseController {

    // 日志工具
    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private UserMapper userMapper;

//    @Autowired
//    private UserRepository userRepository;

    @RequestMapping("/")
    String index() {
        return "Hello~";
    }

    /**
     * 获取所有用户对象列表
     * @return
     */
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    String users() {
        List<User> userList = userMapper.findAll();
        return success("", userList);
    }

    /**
     * 根据id获取指定用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    String getUser(@PathVariable String id) {
        User user = userMapper.findById(id);
        return success("",user);
    }

    /**
     * 新增用户对象
     * @param user
     */
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    String save(@RequestBody User user) {
        user.setId(UUIDGenerator.randomUUID());
        userMapper.insert(user);
        return success("添加成功");
    }

    /**
     * 根据主键id删除用户对象
     * @param id
     */
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    String deleteUser(@PathVariable String id) {
        userMapper.delete(id);
        return success("删除成功");
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    String update(@RequestBody User user) {
        userMapper.update(user);
        return success("更新成功");
    }

}
