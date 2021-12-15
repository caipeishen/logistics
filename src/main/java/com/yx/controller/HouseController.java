package com.yx.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import com.yx.model.Logistics;
import com.yx.service.IHouseService;
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
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yanghuihui
 * @since 2020-12-08
 */
@Api(tags = {"物流管理API"})
@RestController
@RequestMapping("/logistics")
public class HouseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Resource
    private IHouseService houseService;

    @RequestMapping("/logisticsAll")
    public JsonObject queryLogisticsAll(String logNo,
                                        String departTime,
                                  @RequestParam(defaultValue = "1")  Integer page,
                                    @RequestParam(defaultValue = "15")  Integer limit){
        PageInfo<Logistics> pageInfo=houseService.findLogisticsAll(page,limit, logNo, departTime);
        return  new JsonObject(0,"ok",pageInfo.getTotal(),pageInfo.getList());
    }

    @RequestMapping("/queryAll")
    public  List<Logistics> queryAll(){
        PageInfo<Logistics> pageInfo=houseService.findLogisticsAll(1,100,null, null);
        return pageInfo.getList();
    }


    @ApiOperation(value = "新增")
    @RequestMapping("/add")
    public R add(@RequestBody Logistics logistics){
        int num= houseService.add(logistics);
        if(num>0){
            return R.ok();
        }else{
            return R.fail("添加失败");
        }
    }

    @ApiOperation(value = "删除")
    @RequestMapping("/deleteByIds")
    public R delete(String ids){
        //z转成集合对象
       List<String> list= Arrays.asList(ids.split(","));
       for(String id:list){
           Long idLong=Long.parseLong(id);
           houseService.delete(idLong);
       }
       return R.ok();
    }

    @ApiOperation(value = "更新")
    @RequestMapping("/update")
    public R update(@RequestBody Logistics logistics){
        int num= houseService.updateData(logistics);
        if(num>0){
            return R.ok();
        }else{
            return R.fail("修改失败");
        }
    }

    @ApiOperation(value = "查询分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<Logistics> findListByPage(@RequestParam Integer page,
                                           @RequestParam Integer pageCount){
        return houseService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询")
    @GetMapping("{id}")
    public Logistics findById(@PathVariable Long id){
        return houseService.findById(id);
    }

}
