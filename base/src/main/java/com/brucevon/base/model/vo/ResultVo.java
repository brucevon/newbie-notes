package com.brucevon.base.model.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * ResultVo.
 *
 * @param <T> T
 * @author BruceVon
 */
@Accessors(chain = true)
@NoArgsConstructor
@Data
public class ResultVo<T> {

    /**
     * Response code.
     */
    private Integer code;

    /**
     * Response data.
     */
    private T data;

    /**
     * Response message.
     */
    private String msg;
}
