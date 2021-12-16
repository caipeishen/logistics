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

    private String logNo;

    private String typeId;

    @TableField(exist = false)
    private String typeName;

    private String driverName;

    private String startPlace;

    private String endPlace;

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
