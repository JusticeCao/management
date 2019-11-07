package com.users.user.service;

import com.users.user.domain.vo.UserVo;

public interface UserService {
    UserVo getPoints(int uid) throws Exception;
}
