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
     * 注册
     * @param user
     * @return
     */
    int add(User user);

    /**
     * 登录
     * @param user
     * @return
     */
    User queryUserByStuNoAndPwd(User user);

}
