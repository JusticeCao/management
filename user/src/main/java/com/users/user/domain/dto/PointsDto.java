package com.users.user.domain.dto;

import lombok.Data;

@Data
public class PointsDto {
    private Integer pid;

    /**
    * 等级
    */
    private Integer score;

    private Integer uid;
}