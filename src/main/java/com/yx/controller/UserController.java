package com.yx.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import com.yx.model.User;
import com.yx.service.IUserService;
import com.yx.util.JsonObject;
import com.yx.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yanghuihui
 * @since 2020-11-28
 */
@Api(tags = {""})
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IUserService userinfoService;

    @ApiOperation(value = "新增")
    @RequestMapping("/add")
    public R add(@RequestBody User user){
        userinfoService.add(user);
        return R.ok();
    }

}
