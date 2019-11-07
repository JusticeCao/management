package com.points.point.domain.entity;

import lombok.Data;

@Data
public class Points {
    private Integer pid;

    /**
    * 等级
    */
    private Integer score;

    private Integer uid;
}