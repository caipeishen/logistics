package com.yx.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.yx.model.Logistics;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yanghuihui
 * @since 2020-12-08
 */
public interface IHouseService extends IService<Logistics> {

    /**
     * 分页查询房屋信息
     */
    PageInfo<Logistics> findLogisticsAll(int page, int pageSize, String logNo, String departTime);

    List<Logistics> findList();

    /**
     * 查询分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<House>
     */
    IPage<Logistics> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加
     *
     * @param logistics
     * @return int
     */
    int add(Logistics logistics);

    /**
     * 删除
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改
     *
     * @param logistics
     * @return int
     */
    int updateData(Logistics logistics);

    /**
     * id查询数据
     *
     * @param id id
     * @return House
     */
    Logistics findById(Long id);
}
