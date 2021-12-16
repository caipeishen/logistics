package com.yx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yx.model.CarType;
import com.yx.model.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yanghuihui
 * @since 2020-11-28
 */
public interface ICarTypeService extends IService<CarType> {

    List<CarType> findAll();
}
