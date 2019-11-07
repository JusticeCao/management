package com.users.user.service;

import com.users.user.domain.dto.PointsDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class PointsServiceTest {
    @Resource
    PointsService pointsService;

    @Test
    void pointsDtoList() {
        List<PointsDto> pointsDtos = pointsService.pointsDtoList(1);
        log.info(pointsDtos.toString());
    }
}