package com.brucevon.base.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * ResultVo.
 *
 * @param <T> T
 * @author BruceVon
 */
@ApiModel(value = "API返回模型", description = "API通用返回数据模型")
@Accessors(chain = true)
@NoArgsConstructor
@Data
public class ResultVo<T> {

    /**
     * Response code.
     */
    @ApiModelProperty(
            name = "状态码",
            notes = "API返回状态",
            required = true,
            dataType = "integer")
    private Integer code;

    /**
     * Response data.
     */
    @ApiModelProperty(
            name = "返回值",
            notes = "API返回数据",
            required = true,
            dataType = "object")
    private T data;

    /**
     * Response message.
     */
    @ApiModelProperty(
            name = "信息",
            notes = "API返回信息",
            required = true,
            dataType = "string")
    private String msg;
}
