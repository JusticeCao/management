package com.points.point.mapper;

import com.points.point.domain.entity.Points;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface PointsMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Points record);

    int insertSelective(Points record);

    Points selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Points record);

    int updateByPrimaryKey(Points record);

    List<Points>selectByUserId(@Param("uid") Integer uid);
}