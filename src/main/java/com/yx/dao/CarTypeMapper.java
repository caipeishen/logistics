package com.yx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yx.model.CarType;
import com.yx.model.User;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yanghuihui
 * @since 2020-11-28
 */
@Component("carTypeDao")
public interface CarTypeMapper extends BaseMapper<CarType> {

}
