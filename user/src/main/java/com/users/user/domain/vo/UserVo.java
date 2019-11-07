package com.users.user.domain.vo;

import com.users.user.domain.dto.PointsDto;
import lombok.Data;

import java.util.List;

@Data
public class UserVo {
    private List<PointsDto>pointsDtoList;
}