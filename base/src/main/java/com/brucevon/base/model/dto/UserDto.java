package com.brucevon.base.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * UserDto.
 *
 * @author BruceVon
 */
@Accessors(chain = true)
@NoArgsConstructor
@Data
public class UserDto {

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
