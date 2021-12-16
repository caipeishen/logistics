package com.yx.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yx.dao.CarTypeMapper;
import com.yx.dao.HouseMapper;
import com.yx.model.CarType;
import com.yx.model.Logistics;
import com.yx.service.ICarTypeService;
import com.yx.service.IHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yanghuihui
 * @since 2020-12-08
 */
@Service
public class CarTypeServiceImpl extends ServiceImpl<CarTypeMapper, CarType> implements ICarTypeService {

    @Autowired
    private CarTypeMapper carTypeDao;

    @Override
    public List<CarType> findAll() {
        return this.carTypeDao.selectList(null);
    }
}
