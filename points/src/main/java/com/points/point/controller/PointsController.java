package com.points.point.controller;

import com.points.point.domain.entity.Points;
import com.points.point.service.PointsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/point")
@Slf4j
public class PointsController {
    @Resource
    PointsService pointsService;

    @GetMapping(value = "/list/{uid}")
    public List<Points> list(@PathVariable("uid") int uid){
        return pointsService.selectByUserId(uid);
    }
}
