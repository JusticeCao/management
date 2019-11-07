package com.points.point.service;

import com.points.point.domain.entity.Points;

import java.util.List;

public interface PointsService {
    List<Points> selectByUserId(Integer uid);
}
