package com.yx.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.yx.model.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yanghuihui
 * @since 2020-11-28
 */
public interface IUserService extends IService<User> {

    /**
     * 查询分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Userinfo>
     */
    IPage<User> findListByPage(Integer page, Integer pageCount);

    PageInfo<User> findUserAll(int page, int pageSize, User user);

    /**
     * 添加
     *
     * @param user
     * @return int
     */
    int add(User user);

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
     * @param user
     * @return int
     */
    int updateData(User user);

    /**
     * id查询数据
     *
     * @param id id
     * @return Userinfo
     */
    User findById(Long id);

    User queryUserByStuNoAndPwd(User user);

    void deleteUserByUsername(String username);
}
