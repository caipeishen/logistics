package com.yx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yx.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yanghuihui
 * @since 2020-11-28
 */
@Component("userDao")
public interface UserMapper extends BaseMapper<User> {

    User queryUserByStuNoAndPwd(User user);
}
