package com.yx.controller;

import com.yx.model.User;
import com.yx.service.IUserService;
import com.yx.util.ChineseCharToEn;
import com.yx.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.yx.util.Constants.FAIL_CODE;
import static com.yx.util.Constants.OK_CODE;

/**
 * 注册、登录、退出登录
 */
@Controller
public class LoginController {
    @Autowired
    private IUserService userinfoService;

    /**
     * 登录
     * @param userinfo
     * @param request
     * @return
     */
    @RequestMapping("/loginIn")
    @ResponseBody
    public R loginIn(User userinfo, HttpServletRequest request){
        HttpSession session=request.getSession();
        if(session==null){
            return R.fail("登录超时了");
        }

        User user = userinfoService.queryUserByStuNoAndPwd(userinfo);
        if(user == null){
            return R.fail("用户名或者密码错误");
        } else {
            user.setPassword(null);
            session.setAttribute("user", user);
            return R.ok(user);
        }
    }

    /**
     * 注册
     * @param userinfo
     * @param request
     * @return
     */
    @RequestMapping("/registerIn")
    @ResponseBody
    public R registerIn(User userinfo, HttpServletRequest request){
        HttpSession session=request.getSession();
        if(session==null){
            return R.fail(FAIL_CODE, "注册超时了");
        }
        String substring = userinfo.getStuNo().substring(userinfo.getStuNo().length() - 4, userinfo.getStuNo().length());
        ChineseCharToEn cte = new ChineseCharToEn();
        userinfo.setNickname(cte.getAllFirstLetter(userinfo.getUsername()) + substring);
        int add = this.userinfoService.add(userinfo);
        if (add != 1) {
            return R.fail("注册失败");
        }
        return R.ok();
    }

    /**
     * 退出功能
     */
    @RequestMapping("/loginOut")
    public void loginOut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session=request.getSession();
        session.invalidate();
        response.sendRedirect(request.getContextPath()+"/login.html");
    }
}
