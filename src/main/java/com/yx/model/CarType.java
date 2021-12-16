package com.yx.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Author: yanghuihui
 * @Date: 2021/12/16 9:47
 * @Description:
 */
@Data
@TableName("car_type")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="cartype对象", description="")
public class CarType {

    private static final long serialVersionUID = 3L;

    @TableId(value = "type_id", type = IdType.AUTO)
    private Integer typeId;

    private String typeName;
}
