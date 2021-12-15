package com.yx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yx.model.Logistics;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component("houseDao")
public interface HouseMapper extends BaseMapper<Logistics> {

    /**
     * 查询
     */

    List<Logistics> findLogisticsAll(@Param("logNo") String logNo, @Param("departTime") String departTime);
}
