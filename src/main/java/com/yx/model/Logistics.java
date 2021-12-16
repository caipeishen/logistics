package com.yx.model;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author yanghuihui
 * @since 2020-12-08
 */
@Data
@TableName("logistics")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="House对象", description="")
public class Logistics implements Serializable {

    private static final long serialVersionUID = 2L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    // 物流编号
    private String logNo;

    // 车辆类型ID
    private String typeId;

    // 车辆类型名称
    @TableField(exist = false)
    private String typeName;

    // 司机姓名
    private String driverName;

    // 出发地
    private String startPlace;

    // 目的地
    private String endPlace;

    // 发车时间
    private Date departTime;

    private String createBy;

    @TableField(exist = false)
    private String createByName;

    private Date createTime;

    private String updateBy;

    @TableField(exist = false)
    private String updateByName;

    private Date updateTime;

}
