package com.brucevon.base.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Controller Constant Enum.
 *
 * @author BruceVon
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ControllerConstantEnum {

    /**
     * Request success.
     */
    SUCCESS(1, "Success"),

    /**
     * Request failed.
     */
    FAILED(0, "Failed");

    /**
     * Code.
     */
    private Integer code;

    /**
     * Message.
     */
    private String msg;
}
