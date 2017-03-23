package com.king.demo.web;

import com.king.demo.domain.dto.UserDTO;
import com.king.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by King on 2017/3/9.
 *
 * 用户服务接口控制器
 */

@RestController
@RequestMapping("/users")
public class UserController extends BaseController {

    /**
     * 用户服务
     */
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public ResponseEntity create(@RequestBody UserDTO userDTO) {
        Integer result = userService.save(userDTO);

        logger.debug(userDTO.toString());

        if(result > 0) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
