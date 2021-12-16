package com.yx.controller.context;

import com.yx.model.User;

/**
 * @Author: yanghuihui
 * @Date: 2021/12/16 9:29
 * @Description:
 */
public class UserContext {

    /** 当前登陆用户 */
    private static ThreadLocal<User> user = new ThreadLocal<User>();

    public static User getUser() {
        return UserContext.user.get();
    }

    public static void setUser(User user) {
        UserContext.user.set(user);
    }
}
