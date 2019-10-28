package com.brucevon.base.service.impl;

import com.brucevon.base.dao.UserDao;
import com.brucevon.base.model.vo.UserVo;
import com.brucevon.base.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl.
 *
 * @author BruceVon
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    /**
     * Inject UserDao.
     */
    @Autowired
    private UserDao userDao;

    /**
     * Get user by id.
     *
     * @param id user id
     * @return UserVo
     */
    @Override
    public UserVo getUser(final String id) {
        log.debug("Entering getUser(id: [{}])", id);
        UserVo userVo = userDao.getUser(id);
        log.debug("Leaving getUser: [{}]", userVo);
        return userVo;
    }
}
