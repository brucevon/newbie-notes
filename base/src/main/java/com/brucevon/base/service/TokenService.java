package com.brucevon.base.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.brucevon.base.model.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
public class TokenService {

    /**
     * token 有效期
     */
    private static Integer EXPIRE_TIME = 30 * 60 * 1000;

    public static String getToken(UserVo user) {
        log.debug("Entering getToken(user: {})", user);
        String token = "";
        // 生成时间
        long createTime = System.currentTimeMillis();
        // 过期时间
        token = JWT.create()
                .withAudience(String.valueOf(user.getId()))
                .withExpiresAt(new Date(createTime + EXPIRE_TIME))
                .sign(Algorithm.HMAC256(user.getPassword()));
        log.debug("Leaving getToken: {}", token);
        return token;
    }
}
