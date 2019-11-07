package com.users.user.service;

import com.users.user.domain.dto.PointsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@FeignClient("points")
public interface PointsService {
    @GetMapping("/point/list/{uid}")
    List<PointsDto>pointsDtoList(@PathVariable("uid") int uid);
}
