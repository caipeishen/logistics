package com.yx.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yx.controller.context.UserContext;
import com.yx.dao.LogisticsMapper;
import com.yx.model.Logistics;
import com.yx.model.User;
import com.yx.service.ILogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
public class LogisticsServiceImpl extends ServiceImpl<LogisticsMapper, Logistics> implements ILogisticsService {
    @Autowired
    private LogisticsMapper houseDao;
    @Override
    public PageInfo<Logistics> findLogisticsAll(int page, int pagesize, String logNo, String departTime) {
        PageHelper.startPage(page,pagesize);
        List<Logistics> list=houseDao.findLogisticsAll(logNo, departTime);
        PageInfo<Logistics> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<Logistics> findList() {
        return baseMapper.selectList(null);
    }

    @Override
    public IPage<Logistics> findListByPage(Integer page, Integer pageCount){
        IPage<Logistics> wherePage = new Page<>(page, pageCount);
        Logistics where = new Logistics();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(Logistics logistics){
        User user = UserContext.getUser();
        logistics.setCreateBy(user.getId()+"");
        logistics.setUpdateBy(user.getId()+"");
        logistics.setCreateTime(new Date());
        logistics.setUpdateTime(new Date());
        return baseMapper.insert(logistics);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Logistics logistics){
        User user = UserContext.getUser();
        logistics.setUpdateBy(user.getId()+"");
        logistics.setUpdateTime(new Date());
        return baseMapper.updateById(logistics);
    }

    @Override
    public Logistics findById(Long id){
        return  baseMapper.selectById(id);
    }

}
