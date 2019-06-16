package com.brucevon.base.service;

import com.brucevon.base.model.vo.UserVo;

/**
 * UserService.
 *
 * @author BruceVon
 */
public interface UserService {

    /**
     * Get User.
     *
     * @param id user id
     * @return UserVo
     */
    UserVo getUser(int id);
}
