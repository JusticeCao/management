package com.users.user.controller;

import com.users.user.domain.vo.UserVo;
import com.users.user.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping("/list/{uid}")
    public UserVo list(@PathVariable("uid") int uid)throws Exception{

        return userService.getPoints(uid);
    }

}
