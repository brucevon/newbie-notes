package com.brucevon.base.controller;

import com.brucevon.base.annotation.PassToken;
import com.brucevon.base.model.vo.UserVo;
import com.brucevon.base.service.TokenService;
import com.brucevon.base.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TokenController {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UserService userService;

    @PassToken
    @PostMapping("/token")
    public String token(@RequestBody UserVo user) {
        String result;
        UserVo realUser = userService.getUser(user.getId());
        if (realUser == null) {
            result = "User does not exist.";
            return result;
        }
        if (!realUser.getPassword().equals(user.getUsername())) {
            result = "Username is error.";
            return result;

        }
        if (!realUser.getPassword().equals(user.getPassword())) {
            result = "Password is error.";
            return result;
        }
        return tokenService.getToken(user);
    }
}
