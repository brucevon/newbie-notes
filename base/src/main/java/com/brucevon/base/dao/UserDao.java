package com.brucevon.base.dao;

import com.brucevon.base.model.vo.UserVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * UserDao.
 *
 * @author BruceVon
 */
@Repository
public interface UserDao {

    /**
     * Get user by id.
     *
     * @param id user id
     * @return UserDto
     */
    UserVo getUser(@Param("id") String id);
}
