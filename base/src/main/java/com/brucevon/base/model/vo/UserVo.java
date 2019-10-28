package com.brucevon.base.model.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * UserVo.
 *
 * @author BruceVon
 */
@Accessors(chain = true)
@NoArgsConstructor
@Data
public class UserVo {

    /**
     * id.
     */
    private String id;

    /**
     * username.
     */
    private String username;

    /**
     * password.
     */
    private String password;
}
