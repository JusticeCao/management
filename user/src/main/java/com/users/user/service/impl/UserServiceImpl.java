package com.users.user.service.impl;

import com.users.user.domain.dto.PointsDto;
import com.users.user.domain.vo.UserVo;
import com.users.user.mapper.UserMapper;
import com.users.user.service.PointsService;
import com.users.user.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Resource
    PointsService pointsService;

    @Override
    public UserVo getPoints(int uid) throws Exception {
         List<PointsDto> pointsDto = pointsService.pointsDtoList(uid);

         UserVo userVo = new UserVo();

         userVo.setPointsDtoList(pointsDto);


        return userVo;
    }
}
