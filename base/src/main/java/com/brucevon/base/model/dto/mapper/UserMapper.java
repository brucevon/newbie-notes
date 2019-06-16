package com.brucevon.base.model.dto.mapper;

import com.brucevon.base.model.dto.UserDto;
import com.brucevon.base.model.vo.UserVo;
import lombok.extern.slf4j.Slf4j;

/**
 * UserMapper.
 *
 * @author BruceVon
 */
@Slf4j
public final class UserMapper {

    /**
     * Constructor.
     */
    private UserMapper() {
    }

    /**
     * UserVo transform to UserDto.
     *
     * @param userVo UserVo
     * @return UserDto
     */
    public static UserDto toUserDto(final UserVo userVo) {
        return new UserDto()
                .setId(userVo.getId())
                .setUsername(userVo.getUsername())
                .setPassword(userVo.getPassword());
    }
}
