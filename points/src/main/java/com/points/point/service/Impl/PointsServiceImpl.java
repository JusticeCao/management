package com.points.point.service.Impl;

import com.points.point.domain.entity.Points;
import com.points.point.mapper.PointsMapper;
import com.points.point.service.PointsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PointsServiceImpl implements PointsService {
    @Resource
    PointsMapper pointsMapper;

    @Override
    public List<Points> selectByUserId(Integer uid) {

        return pointsMapper.selectByUserId(uid);
    }
}
