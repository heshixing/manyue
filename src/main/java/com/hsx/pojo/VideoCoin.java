package com.hsx.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 视频投币记录表
 * @TableName t_video_coin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "视频投币记录表对应实体类")
public class VideoCoin implements Serializable {

    /**
     * 主键id
     */
    @ApiModelProperty("主键id")
    private Long id;

    /**
     * 用户id
     */
    @ApiModelProperty("用户id")
    private Long userId;

    /**
     * 视频id
     */
    @ApiModelProperty("视频id")
    private Long videoId;

    /**
     * 投币数
     */
    @ApiModelProperty("投币数")
    private Integer amount;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;


    private static final long serialVersionUID = 1L;
}